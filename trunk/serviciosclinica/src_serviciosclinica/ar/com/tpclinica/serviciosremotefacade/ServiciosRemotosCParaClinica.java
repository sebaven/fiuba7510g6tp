package ar.com.tpclinica.serviciosremotefacade;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import recepcionarOrden.OrdenMedicaDTo;

import localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinica;
import localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaService;
import localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaServiceLocator;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.servicioremoto.orden.dto.OrdenMedicaDTO;
import ar.com.tpclinica.servicios.interfaces.ISerrvicioRemotoOrdenMedica;

/**
 * Todos los servicios remotos que la clinica desee usar tienen una
 * implementación, que esta utilizando un servicio proporcionado por un sistema
 * diferente. Aca se hace la delegacion en ese sistema diferente (la llamada al
 * servicio remoto) y la transformacion del modelo IOrdenMedica a un modelo que
 * el servicio remoto sepa intender. Aca se transforma el objeto en DTO y se
 * llama al servicio remoto.
 * 
 * @author carlos
 * 
 */
class ServiciosRemotosCParaClinica implements ISerrvicioRemotoOrdenMedica {

	/**
	 * Aca va el servico remoto al que se llama en serio
	 */
	private Object serviciosRemotoPosta;
	
	public void enviarOrdenLaboratorio(OrdenMedica ordenMedica,
			String codigoLaboratorio)  {

		
		Collection<OrdenMedica> ordenCollection=new ArrayList<OrdenMedica>();
		ordenCollection.add(ordenMedica);
		this.enviarOrdenLaboratorio(ordenCollection, codigoLaboratorio);
	}

	public void enviarOrdenLaboratorio(Collection<OrdenMedica> ordenesMedicas,
			String codigoLaboratorio){
		
		ServiciosRemotosLParaClinica service;
		try {
			service = new ServiciosRemotosLParaClinicaServiceLocator()
			.getServiciosRemotosLParaClinica();
		
		OrdenMedicaAssembler ordenMedicaAssembler= new OrdenMedicaAssembler();

		OrdenMedicaDTo[] ordenesDTO =new OrdenMedicaDTo[ordenesMedicas.size()];
		
		int i=0;
		
		for (Iterator iterator = ordenesMedicas.iterator(); iterator.hasNext();) {
			ordenesDTO[i]= ordenMedicaAssembler.desensamblar((OrdenMedica) iterator.next());
			service.recibirOrdenesMedicas(ordenesDTO);
			
		}
		
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new RemoteFacadeException(e1);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RemoteFacadeException(e);
		}
	}

	
}
