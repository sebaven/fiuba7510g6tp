package ar.com.tpclinica.servicioremoto;

import java.rmi.RemoteException;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.OrdenMedicaItem;
import ar.com.tpclinica.persistencia.RepositorioOrdenes;
import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;
import ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO;
import ar.com.tpclinica.servicioremoto.orden.ResultadoOrdenMedicaDTO;
import ar.com.tpclinica.serviciosremotefacade.RemoteFacadeException;


/**
 * TODO mover a la capa de servicios de aplicacion.
 * Hay que dividir una jar para el modelo y otro para la parte de presentacion. Sino no es posible crear componentes
 * Servicio remoto para la recepcion de la orden, este servicios es expuesto por la clinica par el laboratorio.
 * @author carlos
 *
 */
public class ServiciosRemotosCParaLaboratorio {
	
	
	/**
	 * Recibe los dto e interactura con los el repositorio para actualizar el estado
	 * @param resultadoOrdenMedicaDTO
	 */
	public void recibirResultadoOrdenMedica(ResultadoOrdenMedicaDTO resultadoOrdenMedicaDTO){
		ResultadoAssembler resultadoAssembler=new ResultadoAssembler();
		RepositorioOrdenes repoOrden=RepositoriosProvider.getInstancia().getRepositorioOrdenes();
		OrdenMedica orden;
		try {
			orden = repoOrden.getPorNroOrden(resultadoOrdenMedicaDTO.getNroOrden());
		} catch (ObjetoNoExisteExcepcion e) {
			e.printStackTrace();
			throw new RemoteFacadeException("no existe orden");
		}
	
		ResultadoItemDTO[] resultadosItemDTO=resultadoOrdenMedicaDTO.getResultadoItem();
		
		
		for (int i = 0; i < resultadosItemDTO.length; i++) {
			final ResultadoItemDTO resultadoItemDTO=resultadosItemDTO[i];
			
			
			OrdenMedicaItem ordenItem=
			(OrdenMedicaItem) CollectionUtils.find(orden.getItems(), new Predicate(){

				public boolean evaluate(Object arg0) {
					OrdenMedicaItem item=(OrdenMedicaItem)arg0;
					return item.getPrestacion().getCodigo().equals(resultadoItemDTO.getCodigoPrestacion());
				}
			});
			
			if(ordenItem!=null){
				ordenItem.setResultado(resultadoAssembler.ensamblar(resultadoItemDTO));
			}
			repoOrden.modify(orden.getId(),orden);
		}
		
	}
	
	
}