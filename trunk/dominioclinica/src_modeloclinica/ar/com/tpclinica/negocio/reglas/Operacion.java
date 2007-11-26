package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public interface Operacion {
	public ResultadoRegla aplicar(OrdenMedica om);
	public int getTipo();
}
