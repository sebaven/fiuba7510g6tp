package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class PrestacionesPorOrden extends Operando {
private String prestacion;
	
	public PrestacionesPorOrden(String presta) {
		prestacion = presta;
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
		//TODO!!!
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		PrestacionesPorOrden o = (PrestacionesPorOrden)obj;
		OrdenMedica om = null;
		
		if (o.getValor(om)==this.getValor(om))
			return true;
		else return false;
	
	}
}
