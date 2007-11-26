package ar.com.tplaboratorio.negocio;

import java.util.ArrayList;
import java.util.List;

public class OrdenMedicaLab {
	private int id;
	private String paciente;
	private String medico;
	private String diagnostico;
	private int nroOrden;
	private List<ItemOrdenMedica> items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public void setItems(List<ItemOrdenMedica> items) {
		this.items = items;
	}
	public void agregarItem(ItemOrdenMedica item){
		this.getItems().add(item);
		
	}
	public int getNroOrden() {
		return nroOrden;
	}
	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}
	public List<ItemOrdenMedica> getItems() {
		if(this.items==null){
			this.items=new ArrayList();
		}
		return items;
	}
	
	

}
