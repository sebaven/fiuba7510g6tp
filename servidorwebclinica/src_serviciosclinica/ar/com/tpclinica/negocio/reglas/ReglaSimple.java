package ar.com.tpclinica.negocio.reglas;

import java.util.Collection;

public class ReglaSimple {
	private String comparador, cumple, noCumple, conector;
	private Collection<Limitante> limitantes;
	/**
	 * @return the comparador
	 */
	public String getComparador() {
		return comparador;
	}
	/**
	 * @param comparador the comparador to set
	 */
	public void setComparador(String comparador) {
		this.comparador = comparador;
	}
	/**
	 * @return the conector
	 */
	public String getConector() {
		return conector;
	}
	/**
	 * @param conector the conector to set
	 */
	public void setConector(String conector) {
		this.conector = conector;
	}
	/**
	 * @return the cumple
	 */
	public String getCumple() {
		return cumple;
	}
	/**
	 * @param cumple the cumple to set
	 */
	public void setCumple(String cumple) {
		this.cumple = cumple;
	}
	/**
	 * @return the limitantes
	 */
	public Collection<Limitante> getLimitantes() {
		return limitantes;
	}
	/**
	 * @param limitantes the limitantes to set
	 */
	public void setLimitantes(Collection<Limitante> limitantes) {
		this.limitantes = limitantes;
	}
	/**
	 * @return the noCumple
	 */
	public String getNoCumple() {
		return noCumple;
	}
	/**
	 * @param noCumple the noCumple to set
	 */
	public void setNoCumple(String noCumple) {
		this.noCumple = noCumple;
	}

}
