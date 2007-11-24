package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class OperacionAnd implements Operacion {
	private Operacion primerOperacion, segundaOperacion;
	
	/**
	 * @return the primerOperacion
	 */
	public Operacion getPrimerOperacion() {
		return primerOperacion;
	}

	/**
	 * @param primerOperacion the primerOperacion to set
	 */
	public void setPrimerOperacion(Operacion primerOperacion) {
		this.primerOperacion = primerOperacion;
	}

	/**
	 * @return the segundaOperacion
	 */
	public Operacion getSegundaOperacion() {
		return segundaOperacion;
	}

	/**
	 * @param segundaOperacion the segundaOperacion to set
	 */
	public void setSegundaOperacion(Operacion segundaOperacion) {
		this.segundaOperacion = segundaOperacion;
	}

	public OperacionAnd(Operacion A, Operacion B) {
		primerOperacion = A;
		segundaOperacion = B;
	}

	public Resultado aplicar(OrdenMedica om) {
		// TODO Auto-generated method stub
		return null;
	}

}
