package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class Cantidad extends Operando {
	private int valor;
	
	/**
	 * @return the valor
	 */
	public int getValor(OrdenMedica om) {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	public Cantidad(int cantidad) {
		valor = cantidad;
		this.setTipo(0);
	}

	@Override
	public boolean equals(Object obj) {
		OrdenMedica om = null;
		if (((Operando)obj).getValor(om)==valor)
			return true;
		else return false;
	}

}
