package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class OperacionDeResultadoDirecto implements Operacion {
	private Resultado resultado;
	
	/**
	 * @return the resultado
	 */
	public Resultado getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public OperacionDeResultadoDirecto(Resultado resul) {
		resultado = resul;
	}

	public Resultado aplicar(OrdenMedica om) {
		// TODO Auto-generated method stub
		return null;
	}

}
