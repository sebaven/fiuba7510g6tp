package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public abstract class Operando {
	private int tipo;
	
	public Object getValor(OrdenMedica orden) {
		return null;
	}
	public int getTipo() {
		return tipo;
	}

}
