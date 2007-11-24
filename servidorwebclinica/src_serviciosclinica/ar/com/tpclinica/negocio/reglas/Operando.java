package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public abstract class Operando {
	private int tipo;
	
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Object getValor(OrdenMedica orden) {
		return null;
	}
	public int getTipo() {
		return tipo;
	}

}
