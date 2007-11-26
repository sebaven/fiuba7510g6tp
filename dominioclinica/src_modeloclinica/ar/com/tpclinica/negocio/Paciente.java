package ar.com.tpclinica.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {
	public int id;
	private String nombre;
	private String apellido;
	private long dni;
	private String telefono;
	private String mail;
	private Plan plan;
	private Date fechaInicioPlan;
	private List<OrdenMedica> ordenesMedicas;
	
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
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param plan the plan to set
	 * @param _fechaInicioPlan 
	 */
	public void setPlan(Plan plan, Date _fechaInicioPlan) {
		this.plan = plan;
		this.fechaInicioPlan = _fechaInicioPlan;
	}

	public Plan getPlan() {
		return plan;
	}

	public Date getFechaInicioPlan() {
		return fechaInicioPlan;
	}

	/**
	 * @param fechaInicioPlan the fechaInicioPlan to set
	 */
	public void setFechaInicioPlan(Date fechaInicioPlan) {
		this.fechaInicioPlan = fechaInicioPlan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public void addOrden(OrdenMedica ordenMedica) {
		
		this.getOrdenesMedicas().add(ordenMedica);
	}

	public List<OrdenMedica> getOrdenesMedicas() {
		if(ordenesMedicas==null){
			this.ordenesMedicas=new ArrayList<OrdenMedica>();
		}
		return this.ordenesMedicas;
	}

	public void setOrdenesMedicas(List<OrdenMedica> ordenesMedicas) {
		this.ordenesMedicas = ordenesMedicas;
	}

	
}
