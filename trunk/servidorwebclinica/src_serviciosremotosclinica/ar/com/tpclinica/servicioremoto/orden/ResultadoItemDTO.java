package ar.com.tpclinica.servicioremoto.orden;

import java.util.Date;

/**
 * Resultado del analisis de un item para alguna prestacion medica.
 * 
 * @author carlos
 * 
 */
public class ResultadoItemDTO {
	private String codigoPrestacion;
	private String descripcion;
	/**
	 * Subclasificacion de los diferentes tipos de resultado (que no se cuales son)
	 */
	private int tipo;
	private Date fecha;

	public String getCodigoPrestacion() {
		return codigoPrestacion;
	}

	public void setCodigoPrestacion(String codigoPrestacion) {
		this.codigoPrestacion = codigoPrestacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
