package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.Prestacion;

public class PrestacionesPorOrden extends Operando {
private String prestacion;
	
	public PrestacionesPorOrden(String presta) {
		prestacion = presta;
		this.setTipo(2);
	}

	/**
	 * @return the prestacion
	 */
	public String getPrestacion() {
		return prestacion;
	}

	/**
	 * @param prestacion the prestacion to set
	 */
	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}

	public int getValor(OrdenMedica om){
		//cant de veces q  aparece la prestac. atrib. en la omedica q me pasan
		int cant_veces = 0;
		
		for (ar.com.tpclinica.negocio.OrdenMedicaItem omi : om.getItems()) {
			 if (omi.getPrestacion().getDescripcion().equals(this.prestacion)) cant_veces++;
		 }
		return cant_veces;
	}
	
	@Override
	public boolean equals(Object obj) {
		PrestacionesPorOrden o = (PrestacionesPorOrden)obj;
		return this.prestacion.equals(o.prestacion);
	}
}
