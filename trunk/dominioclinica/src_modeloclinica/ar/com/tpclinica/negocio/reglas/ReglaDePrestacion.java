package ar.com.tpclinica.negocio.reglas;

public class ReglaDePrestacion {
	private String prestacion;
	private ReglaSimple regla1,regla2;
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
	public ReglaSimple getRegla1() {
		return regla1;
	}
	public void setRegla1(ReglaSimple regla1) {
		this.regla1 = regla1;
	}
	public ReglaSimple getRegla2() {
		return regla2;
	}
	public void setRegla2(ReglaSimple regla2) {
		this.regla2 = regla2;
	}
	
}
