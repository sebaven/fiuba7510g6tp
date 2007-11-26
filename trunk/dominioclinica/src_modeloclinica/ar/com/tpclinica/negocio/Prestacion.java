package ar.com.tpclinica.negocio;

public class Prestacion {
	private String descripcion;

	private int id;

	/**
	 * Es la forma en que el usuario identifica univocamente al elemento,
	 * independientemente del id que se lo otorga el repo. El id debe estar en
	 * una clase abstracta y comunicarse con la persistencia por medio de un
	 * LayeredType
	 */
	private String codigo;

	/**
	 * @return the descripcion
	 */

	public Prestacion() {
		// TODO Auto-generated constructor stub
	}

	public Prestacion(String descripcion) {
		this("sorga", descripcion);
	}

	public Prestacion(String codigo, String descripcion) {

		this.codigo = codigo;
		this.descripcion = descripcion;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int compareTo(Prestacion prestacion) {
		if ((this.descripcion.compareTo(prestacion.descripcion) == 0)
				&& (this.id == prestacion.id)
				&& (this.codigo.compareTo(prestacion.codigo) == 0))
			return 0;
		return 1;
	}

}
