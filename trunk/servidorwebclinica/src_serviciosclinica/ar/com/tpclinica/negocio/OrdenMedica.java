package ar.com.tpclinica.negocio;

import java.util.List;

public class OrdenMedica {
	private OrdenMedicaEstado estado;
	private boolean enviadaALab;
	private String diagnostico;
	private Paciente paciente;
	private Medico medico;
	private List<OrdenMedicaItem> items;
	
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

}
