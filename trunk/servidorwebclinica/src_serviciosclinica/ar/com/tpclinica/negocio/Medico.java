package ar.com.tpclinica.negocio;

public class Medico {
	private int id;
	private String nombre;
	private String apellido;
	private Especialidad especialidad;
	
	public void getPosiblesItemsOrdenMedicas() {
		
	}
	public String getNombreCompleto() {
		return(nombre + " " + apellido);
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the especialidad
	 */
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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

}
