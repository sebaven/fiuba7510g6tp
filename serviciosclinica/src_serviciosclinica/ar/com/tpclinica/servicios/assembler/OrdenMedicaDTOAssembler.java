package ar.com.tpclinica.servicios.assembler;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ar.com.tpclinica.servicioremoto.orden.dto.OrdenMedicaDTO;
import ar.com.tpclinica.servicios.interfaces.IOrdenMedica;

/**
 * Transforma un {@link IOrdenMedica} a un OrdenMedicaDTO que es lo que entiende el laboratorio
 * @author carlos
 *
 */
public class OrdenMedicaDTOAssembler {

	public OrdenMedicaDTO disasembler(IOrdenMedica ordenMedica){
		throw new NotImplementedException();
	}
	
}
