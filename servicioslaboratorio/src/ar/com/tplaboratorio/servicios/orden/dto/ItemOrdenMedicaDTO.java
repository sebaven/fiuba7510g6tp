package ar.com.tplaboratorio.servicios.orden.dto;

public class ItemOrdenMedicaDTO {
	private int codigoPrestacion;
	private String descripcion;
	private String descripcionPrestacion;

	public int getCodigoPrestacion() {
		return codigoPrestacion;
	}

	public void setCodigoPrestacion(int codigoPrestacion) {
		this.codigoPrestacion = codigoPrestacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionPrestacion() {
		return descripcionPrestacion;
	}

	public void setDescripcionPrestacion(String descripcionPrestacion) {
		this.descripcionPrestacion = descripcionPrestacion;
	}

}
