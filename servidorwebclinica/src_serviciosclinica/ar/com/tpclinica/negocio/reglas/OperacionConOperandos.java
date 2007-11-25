package ar.com.tpclinica.negocio.reglas;

public abstract class OperacionConOperandos implements Operacion {
	private Operando primerOperando, segundoOperando;

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
