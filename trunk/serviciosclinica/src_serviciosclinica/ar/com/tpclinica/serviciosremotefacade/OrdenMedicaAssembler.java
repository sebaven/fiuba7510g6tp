package ar.com.tpclinica.serviciosremotefacade;

import recepcionarOrden.OrdenMedicaDTo;
import ar.com.tpclinica.negocio.OrdenMedica;

/**
 * Transforma los objetos orden medica a orden medica DTO para llamar
 * la metodo recibir ordenes en un servidor remoto de la clinica
 * @author carlos
 *
 */
public class OrdenMedicaAssembler {

	public OrdenMedicaDTo desensamblar(OrdenMedica orden ){
		OrdenMedicaDTo ordenDTO =new OrdenMedicaDTo();
		OrdenMedicaItemAssemler itemAssemler=new OrdenMedicaItemAssemler();
		
		ordenDTO.setDiagnostico(orden.getDiagnostico());
		ordenDTO.setMedico(orden.getMedico().getNombre()+" "+orden.getMedico().getApellido());
		ordenDTO.setPaciente((orden.getPaciente().getNombre()+ " "+orden.getPaciente().getApellido()));
		ordenDTO.setNroOrden(orden.getNroOrden());
		
		ordenDTO.setItems(itemAssemler.desensamblar(orden.getItems()));
		return ordenDTO;
	}
}
