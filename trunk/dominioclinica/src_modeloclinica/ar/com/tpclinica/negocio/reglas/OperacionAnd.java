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
		String resultadoPrimerOperacion,resultadoSegundaOperacion;
		Resultado retVal;
		String resultadoFinal;
		resultadoPrimerOperacion = this.primerOperacion.aplicar(om).getResultado();
		resultadoSegundaOperacion = this.segundaOperacion.aplicar(om).getResultado();
		if (resultadoPrimerOperacion.compareTo("Falso")==0 || resultadoSegundaOperacion.compareTo("Falso")==0)
			resultadoFinal = "Falso";
		else
			if (resultadoPrimerOperacion.compareTo("Autorizar")==0 || resultadoSegundaOperacion.compareTo("Autorizar")==0)
				resultadoFinal = "Autorizar";
			else
				resultadoFinal = "Verdadero";
		retVal = new Resultado(resultadoFinal);
		return retVal;
	}
	@Override
	public boolean equals(Object obj) {
		OperacionAnd o = (OperacionAnd)obj;
		if ((o.getPrimerOperacion().equals(this.primerOperacion)) && (o.getSegundaOperacion().equals(this.segundaOperacion)))
			return true;
		else return false;
	}
}
