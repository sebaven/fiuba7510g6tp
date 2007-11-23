package ar.com.tpclinica.negocio;

import java.util.Collection;

public class Especialidad {
	private int codigo;
	private String nombre;
	private String descripcion;
	private Collection<Prestacion> prestaciones;
	
	public Collection<Prestacion> getPrestaciones() {
		return prestaciones;
	}
	
	

}
