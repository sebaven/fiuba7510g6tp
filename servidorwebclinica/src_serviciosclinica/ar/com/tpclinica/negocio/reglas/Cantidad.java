package ar.com.tpclinica.negocio.reglas;

public class Cantidad extends Operando {
	private int valor;
	
	/**
	 * @return the valor
	 */
	public int getValor() {
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
	}

}
