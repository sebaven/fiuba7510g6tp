package ar.com.tpclinica.negocio.reglas;

public class PrestacionesPorOrden extends Operando {
	private String prestacion;
	
	public PrestacionesPorOrden(String presta) {
		prestacion = presta;
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

}
