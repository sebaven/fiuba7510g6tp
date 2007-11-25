package ar.com.tpclinica.negocio.reglas;

import java.util.Collection;

public class ReglaSimple {
	private String comparador, cumple, noCumple, conector;
	private Collection<Limitante> limitantes1;
	private Limitante limitante2;
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
	public Collection<Limitante> getLimitantes1() {
		return limitantes1;
	}
	public void setLimitantes1(Collection<Limitante> limitantes1) {
		this.limitantes1 = limitantes1;
	}
	public Limitante getLimitante2() {
		return limitante2;
	}
	public void setLimitante2(Limitante limitante2) {
		this.limitante2 = limitante2;
	}

}
