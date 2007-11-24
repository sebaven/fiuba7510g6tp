package ar.com.tpclinica.negocio.reglas;

public class Descripcion extends Operando {
	private String valor;
	
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	public Descripcion(String descripcion) {
		valor = descripcion;
	}

}
