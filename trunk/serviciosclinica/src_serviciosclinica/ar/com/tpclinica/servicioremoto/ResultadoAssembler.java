package ar.com.tpclinica.servicioremoto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ar.com.tpclinica.negocio.Resultado;
import ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO;

public class ResultadoAssembler{
	
	public Resultado ensamblar(ResultadoItemDTO resultadoItem){
		String descripcion=resultadoItem.getDescripcion();
		Date fecha=resultadoItem.getFecha();
		int tipo=resultadoItem.getTipo();
		
		Resultado resultado=new Resultado();
		
		
		resultado.setDescripcion(descripcion);
		resultado.setFecha(fecha);
		resultado.setTipo(tipo);
		
		return resultado;
	}
	public List<Resultado> ensamblar(List<ResultadoItemDTO> resultadosDto){
		
		List<Resultado> resultados=new ArrayList<Resultado>();
		
		for (Iterator iterator = resultadosDto.iterator(); iterator.hasNext();) {
			ResultadoItemDTO resultadoItemDTO = (ResultadoItemDTO) iterator
					.next();
			resultados.add(this.ensamblar(resultadoItemDTO));
			
		}
		return resultados;
	}
}
