package ar.com.tplaboratorio.negocio;

public class ItemOrdenMedica {
	private String descripcion;
	private Resultado resultado;
	private Prestacion prestacion;
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
