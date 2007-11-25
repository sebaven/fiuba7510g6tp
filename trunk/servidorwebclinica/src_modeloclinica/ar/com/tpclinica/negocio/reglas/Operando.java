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
	abstract public int getValor(OrdenMedica orden);
	
	public int getTipo() {
		return tipo;
	}

}
