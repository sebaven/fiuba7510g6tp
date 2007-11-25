package ar.com.tpclinica.negocio;

import java.util.Collection;
import java.util.LinkedList;

public class Especialidad {
	private int codigo;

	private String nombre;

	private String descripcion;

	private Collection<Prestacion> prestaciones;

	public Especialidad() {
		prestaciones = new LinkedList<Prestacion>();
	}

	public Collection<Prestacion> getPrestaciones() {

		return prestaciones;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param prestaciones
	 *            the prestaciones to set
	 */
	public void setPrestaciones(Collection<Prestacion> prestaciones) {
		this.prestaciones = prestaciones;
	}

	public void agregarPrestacion(Prestacion p) {
		prestaciones.add(p);
	}

	public void borrarPrestacion(Prestacion p) {

		prestaciones.remove(p);
	}
}
