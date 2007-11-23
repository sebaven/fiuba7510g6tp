package ar.com.tpclinica.negocio.reglas;

public class PrestacionesPorPeriodoConHistorial extends Operando {
	private int periodo;
	private String prestacion;
	
	public PrestacionesPorPeriodoConHistorial(String presta, int perio) {
		periodo = perio;
		prestacion = presta;
	}

}
