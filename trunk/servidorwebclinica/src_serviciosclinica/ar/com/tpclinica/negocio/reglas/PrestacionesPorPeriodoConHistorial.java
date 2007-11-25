package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class PrestacionesPorPeriodoConHistorial extends Operando {
	private int periodo;
	private String prestacion;
	
	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the prestacion
	 */
	public String getPrestacion() {
		return prestacion;
	}

	/**
	 * @param prestacion the prestacion to set
	 */
	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}

	public PrestacionesPorPeriodoConHistorial(String presta, int perio) {
		periodo = perio;
		prestacion = presta;
	}
	
	public int getValor(OrdenMedica om)
	{
		//TODO!!!!
		return 0;
	}

}
