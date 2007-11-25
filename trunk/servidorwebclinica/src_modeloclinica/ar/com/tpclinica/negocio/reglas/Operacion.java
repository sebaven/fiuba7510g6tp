package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public interface Operacion {
	public Resultado aplicar(OrdenMedica om);

}
