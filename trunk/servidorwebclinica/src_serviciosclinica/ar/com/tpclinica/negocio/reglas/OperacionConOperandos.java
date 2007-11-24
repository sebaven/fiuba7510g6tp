package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public abstract class OperacionConOperandos implements Operacion {
	private Operando primerOperando, segundoOperando;

	public Resultado aplicar(OrdenMedica om) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the primerOperando
	 */
	public Operando getPrimerOperando() {
		return primerOperando;
	}

	/**
	 * @param primerOperando the primerOperando to set
	 */
	public void setPrimerOperando(Operando primerOperando) {
		this.primerOperando = primerOperando;
	}

	/**
	 * @return the segundoOperando
	 */
	public Operando getSegundoOperando() {
		return segundoOperando;
	}

	/**
	 * @param segundoOperando the segundoOperando to set
	 */
	public void setSegundoOperando(Operando segundoOperando) {
		this.segundoOperando = segundoOperando;
	}

}
