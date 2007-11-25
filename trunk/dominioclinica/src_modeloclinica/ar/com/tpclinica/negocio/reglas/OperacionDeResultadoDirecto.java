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
		return this.resultado;
	}
	@Override
	public boolean equals(Object obj) {
		OperacionDeResultadoDirecto o = (OperacionDeResultadoDirecto)obj;
		if (o.getResultado().getResultado().compareTo(this.resultado.getResultado())==0)
			return true;
		else return false;
	}

}
