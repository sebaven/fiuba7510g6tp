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

}
