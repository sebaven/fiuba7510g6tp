package ar.com.tplaboratorio.servicios;

import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;
import ar.com.tplaboratorio.servicioremoto.OrdenAssembler;
import ar.com.tplaboratorio.servicios.orden.dto.OrdeneMedicaDTO;


public class ServiciosRemotosLParaClinica {

	/**
	 * Toma todas las ordenes medicas y las persite en el sistema
	 * @param ordenes
	 */
	public void recibirOrdenesMedicas(OrdeneMedicaDTO[] ordenes){
		OrdenAssembler ordenAssembler=new OrdenAssembler();
		for (int i = 0; i < ordenes.length; i++) {
			OrdeneMedicaDTO ordenMedicaDTO=ordenes[i];
			OrdenMedicaLab ordenMedicaLab=ordenAssembler.createOrdenMedicaLab(ordenMedicaDTO);
			RepositoriosProvider.getInstancia().getRepositorioOrdenes().add(ordenMedicaLab);
		}
	}
}
