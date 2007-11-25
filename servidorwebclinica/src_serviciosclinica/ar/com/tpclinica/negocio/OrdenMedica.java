package ar.com.tpclinica.negocio;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class OrdenMedica {

	private int id;
	
	private OrdenMedicaEstado estado;

	private boolean enviadaALab;

	private String diagnostico;

	private Paciente paciente;

	private Medico medico;

	private List<OrdenMedicaItem> items;
	
	private int nroOrden;
	
	private Date fechaOrden;
	
	
	public OrdenMedica(){
		items = new LinkedList<OrdenMedicaItem>();
	}

	public void cambiarEstado(OrdenMedicaEstado nuevoEstado) {
		estado = nuevoEstado;
	}

	public void agregarItem(OrdenMedicaItem item) {
		items.add(item);
	}

	public void setDiagnostico(String diag) {
		diagnostico = diag;
	}

	public int getIdPaciente() {
		return paciente.id;
	}

	/**
	 * @return the enviadaALab
	 */
	public boolean isEnviadaALab() {
		return enviadaALab;
	}

	/**
	 * @param enviadaALab
	 *            the enviadaALab to set
	 */
	public void setEnviadaALab(boolean enviadaALab) {
		this.enviadaALab = enviadaALab;
	}

	/**
	 * @return the estado
	 */
	public OrdenMedicaEstado getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(OrdenMedicaEstado estado) {
		this.estado = estado;
	}

	/**
	 * @return the items
	 */
	public List<OrdenMedicaItem> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<OrdenMedicaItem> items) {
		this.items = items;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	/**
	 * @param medico
	 *            the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente
	 *            the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
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

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

}
