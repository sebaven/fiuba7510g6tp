package ar.com.tpclinica.negocio;

public class OrdenMedicaItem {
	private String descripcion;

	private Resultado resultado;

	private Prestacion prestacion;

	public OrdenMedicaItem(Prestacion prestacion2) {
		this.setPrestacion(prestacion2);
		this.setDescripcion(prestacion2.getDescripcion());
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Prestacion getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(Prestacion prestacion) {
		this.prestacion = prestacion;
	}

}
