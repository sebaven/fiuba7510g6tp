package ar.com.tpclinica.negocio;

import java.util.Iterator;
import java.util.List;

import ar.com.tpclinica.negocio.exepciones.OrdenMedicaInvalidaException;
import ar.com.tpclinica.negocio.reglas.Operacion;
import ar.com.tpclinica.negocio.reglas.ResultadoRegla;

public class Plan {
	private  Operacion operacion;
	
	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public ResultadoRegla validarOrden(OrdenMedica ordenMedica) throws OrdenMedicaInvalidaException{
		return operacion.aplicar(ordenMedica);
		
		
		
		
	}
	
}
