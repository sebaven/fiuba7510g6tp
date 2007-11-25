package ar.com.tpclinica.negocio;

import java.util.Iterator;
import java.util.List;

import ar.com.tpclinica.negocio.exepciones.OrdenMedicaInvalidaException;
import ar.com.tpclinica.negocio.reglas.Operacion;

public class Plan {
	private  Operacion operacion;
	
	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public ar.com.tpclinica.negocio.reglas.Resultado validarOrden(OrdenMedica ordenMedica) throws OrdenMedicaInvalidaException{
		return operacion.aplicar(ordenMedica);
		
		
		
		
	}
	
}
