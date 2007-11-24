package ar.com.tpclinica.negocio.reglas;

import java.util.Collection;

public class ReglaDePrestacion {
	private String prestacion;
	private Collection<ReglaSimple> reglas;
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
	/**
	 * @return the reglas
	 */
	public Collection<ReglaSimple> getReglas() {
		return reglas;
	}
	/**
	 * @param reglas the reglas to set
	 */
	public void setReglas(Collection<ReglaSimple> reglas) {
		this.reglas = reglas;
	}
	
}
