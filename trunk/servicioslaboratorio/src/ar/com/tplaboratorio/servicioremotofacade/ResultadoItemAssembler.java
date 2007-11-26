package ar.com.tplaboratorio.servicioremotofacade;

import java.util.Calendar;

import ar.com.tplaboratorio.negocio.ItemOrdenMedica;
import DTORespuestaOrden.ResultadoItemDTO;

public class ResultadoItemAssembler {
	
	public ResultadoItemDTO desensamblar(ItemOrdenMedica item){
		ResultadoItemDTO resultadoItemDTO=new ResultadoItemDTO();
		resultadoItemDTO.setCodigoPrestacion(Integer.toString(item.getPrestacion().getCodigo()));
		resultadoItemDTO.setDescripcion(item.getResultado().getDescripcion());
		//TODO usar la fecha correcta
		resultadoItemDTO.setFecha(Calendar.getInstance());
		resultadoItemDTO.setTipo(2);
		return resultadoItemDTO;
	}
}
