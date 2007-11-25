package ar.com.tpclinica.negocio;

import java.util.Iterator;
import java.util.List;

import ar.com.tpclinica.negocio.exepciones.OrdenMedicaInvalidaException;
import ar.com.tpclinica.negocio.reglas.Operacion;

public class Plan {
	private List<Operacion> operaciones;
	
	public void validarOrden(OrdenMedica ordenMedica) throws OrdenMedicaInvalidaException{
		Iterator<Operacion> it=operaciones.iterator();
		
		while (it.hasNext()){
			it.next().aplicar(ordenMedica);
			
		}
	}
	public void agregarOperacion(Operacion o){
		operaciones.add(o);
	}
	public void borrarOperacion(Operacion o){
		operaciones.remove(o);
		
	}
}
