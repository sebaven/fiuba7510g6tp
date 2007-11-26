package ar.com.tplaboratorio.servicioremoto;

import java.util.Iterator;

import ar.com.tplaboratorio.negocio.ItemOrdenMedica;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;
import ar.com.tplaboratorio.servicioremoto.assembler.ItemOrdenLabAssembler;
import ar.com.tplaboratorio.servicios.orden.dto.ItemOrdenMedicaDTO;
import ar.com.tplaboratorio.servicios.orden.dto.OrdeneMedicaDTO;

public class OrdenAssembler {

	public OrdenMedicaLab createOrdenMedicaLab(OrdeneMedicaDTO ordenDTO){
		ItemOrdenLabAssembler itemLabAssembler=new ItemOrdenLabAssembler();
		OrdenMedicaLab ordenMedicaLab=new OrdenMedicaLab();
		
		ordenMedicaLab.setDiagnostico(ordenDTO.getDiagnostico());
		ordenMedicaLab.setMedico(ordenDTO.getMedico());
		ordenMedicaLab.setPaciente(ordenDTO.getPaciente());
		
		for (int i = 0; i < ordenDTO.getItems().length; i++) {
			ordenMedicaLab.agregarItem(itemLabAssembler.ensamblarItem(ordenDTO.getItems()[i]));
		
		}
		return ordenMedicaLab;
	}
	
	public OrdeneMedicaDTO disasembler(OrdenMedicaLab ordenMedica){
		OrdeneMedicaDTO ordenMedicaDTO=new OrdeneMedicaDTO();
		ordenMedicaDTO.setMedico(ordenMedica.getMedico());
		ordenMedicaDTO.setDiagnostico(ordenMedica.getDiagnostico());
		ordenMedicaDTO.setNroOrden(ordenMedica.getNroOrden());
		ordenMedicaDTO.setPaciente(ordenMedica.getPaciente());
		
		ItemOrdenLabAssembler itemAseAssembler=new ItemOrdenLabAssembler();
		
		ItemOrdenMedicaDTO[] itemsDTO=new ItemOrdenMedicaDTO[ordenMedica.getItems().size()];
		
		int i=0;
		for (Iterator iterator = ordenMedica.getItems().iterator(); iterator.hasNext();i++) {
			ItemOrdenMedica itemOrden = (ItemOrdenMedica) iterator.next();
			itemsDTO[i]=itemAseAssembler.desensamblar(itemOrden);
		}
		ordenMedicaDTO.setItems(itemsDTO);
		
		return ordenMedicaDTO;
		
		
	}
}
