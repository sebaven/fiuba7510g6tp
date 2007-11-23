package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class OperacionAnd implements Operacion {
	private Operacion primerOperacion, segundaOperacion;
	
	public OperacionAnd(Operacion A, Operacion B) {
		primerOperacion = A;
		segundaOperacion = B;
	}

	public Resultado aplicar(OrdenMedica om) {
		// TODO Auto-generated method stub
		return null;
	}

}
