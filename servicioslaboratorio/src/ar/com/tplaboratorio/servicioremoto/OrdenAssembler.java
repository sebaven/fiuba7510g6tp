package ar.com.tplaboratorio.servicioremoto;

import ar.com.tplaboratorio.negocio.OrdenMedicaLab;
import ar.com.tplaboratorio.servicioremoto.assembler.ItemOrdenLabAssembler;
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
}
