package ar.com.tplaboratorio.servicioremotofacade;

import java.util.Iterator;

import DTORespuestaOrden.ResultadoItemDTO;
import DTORespuestaOrden.ResultadoOrdenMedicaDTO;
import ar.com.tplaboratorio.negocio.ItemOrdenMedica;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

public class ResultadoOrdenAssembler {

	public ResultadoOrdenMedicaDTO desensamblar(OrdenMedicaLab orden){
		ResultadoOrdenMedicaDTO resultadoDTO=new ResultadoOrdenMedicaDTO();
		ResultadoItemAssembler resultadoItemAssembler=new ResultadoItemAssembler();
		resultadoDTO.setNroOrden(orden.getNroOrden());
		
		ResultadoItemDTO[] resultadosItem=new ResultadoItemDTO[orden.getItems().size()];
		int i=0;
		for (Iterator iterator = orden.getItems().iterator(); iterator.hasNext();i++) {
			ItemOrdenMedica itemOrdenMedica = (ItemOrdenMedica) iterator.next();
			resultadosItem[i]=resultadoItemAssembler.desensamblar(itemOrdenMedica);
		}
		resultadoDTO.setResultadoItem(resultadosItem);
		
		return resultadoDTO;
		
	}
}
