package ar.com.tplaboratorio.servicios.orden.dto;

public class OrdenesMedicasDTO {

	private String paciente;
	private String medico;
	private String diagnostico;
	private int nroOrden;
	private ItemOrdenMedicaDTO[] items;

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public ItemOrdenMedicaDTO[] getItems() {
		return items;
	}

	public void setItems(ItemOrdenMedicaDTO[] items) {
		this.items = items;
	}

}
