package ar.com.tpclinica.serviciosremotefacade;

import java.util.Collection;
import java.util.Iterator;

import recepcionarOrden.ItemOrdenMedicaDTO;
import ar.com.tpclinica.negocio.OrdenMedicaItem;

/**
 * Trasforma un item de la orden en un item para la transferencia en servcio remoto
 * enviarOrdenes del laboratorio
 * @author carlos
 *
 */
public class OrdenMedicaItemAssemler {

	public ItemOrdenMedicaDTO[] desensamblar(Collection<OrdenMedicaItem> items){
		
		ItemOrdenMedicaDTO[] itemsDTO =new ItemOrdenMedicaDTO[items.size()];
		
		int i=0;
		for (Iterator iterator = items.iterator(); iterator.hasNext();i++) {
			OrdenMedicaItem ordenMedicaItem = (OrdenMedicaItem) iterator.next();
			ItemOrdenMedicaDTO itemOrdenMedicaDTO=new ItemOrdenMedicaDTO();
			//CAMBIAR ESO POR FAVOR!!!
			itemOrdenMedicaDTO.setCodigoPrestacion(Integer.parseInt((ordenMedicaItem.getPrestacion().getCodigo())));
			itemOrdenMedicaDTO.setDescripcion(ordenMedicaItem.getDescripcion());
			itemOrdenMedicaDTO.setDescripcionPrestacion(itemOrdenMedicaDTO.getDescripcion());
			
			itemsDTO[i]=itemOrdenMedicaDTO;
		}
		
		return itemsDTO;
		
	}
}
