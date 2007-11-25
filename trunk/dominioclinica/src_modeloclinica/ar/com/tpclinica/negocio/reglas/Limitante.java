package ar.com.tpclinica.negocio.reglas;

public class Limitante {
	private String nombre, buscarEn, valor;
	private int periodo;
	/**
	 * @return the buscarEn
	 */
	public String getBuscarEn() {
		return buscarEn;
	}
	/**
	 * @param buscarEn the buscarEn to set
	 */
	public void setBuscarEn(String buscarEn) {
		this.buscarEn = buscarEn;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}
	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
}




