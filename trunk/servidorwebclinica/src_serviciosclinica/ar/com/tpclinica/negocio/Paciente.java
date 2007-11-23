package ar.com.tpclinica.negocio;

public class Paciente {
	public int id;
	private String nombre;
	private String apellido;
	private long dni;
	private String telefono;
	private String mail;
	private Plan plan;
	
	public Plan getPlan() {
		return plan;
	}

}
