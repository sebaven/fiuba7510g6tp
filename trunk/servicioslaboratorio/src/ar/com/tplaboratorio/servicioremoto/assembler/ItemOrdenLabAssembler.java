package ar.com.tplaboratorio.servicioremoto.assembler;

import ar.com.tplaboratorio.negocio.ItemOrdenMedica;
import ar.com.tplaboratorio.negocio.Prestacion;
import ar.com.tplaboratorio.servicios.orden.dto.ItemOrdenMedicaDTO;

public class ItemOrdenLabAssembler {

	public ItemOrdenMedica ensamblarItem(ItemOrdenMedicaDTO itemOrdenMedicaDTO) {
		
		ItemOrdenMedica itemOrdenMedica=new ItemOrdenMedica();
		itemOrdenMedica.setDescripcion(itemOrdenMedicaDTO.getDescripcion());
		Prestacion p=new Prestacion();
		p.setCodigo(itemOrdenMedicaDTO.getCodigoPrestacion());
		p.setId(itemOrdenMedicaDTO.getCodigoPrestacion());
		p.setDescripcion(itemOrdenMedicaDTO.getDescripcionPrestacion());
		itemOrdenMedica.setPrestacion(p);
		
		
		return itemOrdenMedica;
		
	}
	
	public ItemOrdenMedicaDTO desensamblar(ItemOrdenMedica itemOrden){
		ItemOrdenMedicaDTO itemOrdenDTO=new ItemOrdenMedicaDTO();
		itemOrdenDTO.setCodigoPrestacion(itemOrden.getPrestacion().getCodigo());
		itemOrdenDTO.setDescripcion(itemOrden.getDescripcion());
		itemOrdenDTO.setDescripcionPrestacion(itemOrden.getPrestacion().getDescripcion());
		return itemOrdenDTO;
	}
	

}
