package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class OperacionDeResultadoDirecto implements Operacion {
	private Resultado resultado;
	
	public OperacionDeResultadoDirecto(Resultado resul) {
		resultado = resul;
	}

	public Resultado aplicar(OrdenMedica om) {
		// TODO Auto-generated method stub
		return null;
	}

}
