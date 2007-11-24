package ar.com.tpclinica.serviciosaplicacion;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.OrdenMedicaItem;
import ar.com.tpclinica.persistencia.Repositorio;

public class ServiciosAplicacionClinicaOrdenMedica extends
		ServiciosAplicacionClinica {
	private Repositorio<OrdenMedica> respositorioOrdenesMedicas;
	public void autorizarOrdenMedica(int idOrdenMedica) {
	
	}
	public void cancelarOrdenMedica(int idOrdenMedica) {
		
	}
	public OrdenMedica getOrdenMedica(int idOrdenMedica) {
		return respositorioOrdenesMedicas.get(idOrdenMedica);
	}
	public OrdenMedica crearNuevaOrdenMedica(int idMedico, int idPaciente) {
		return null;
	}
	public void asentarOrdenMedica(int idOrdenMedica) {
		
	}
	public void agregarDiagnosticoAOrdenMedica(int idOrdenMedica, String diagnostico) {
		
	}
	public void agregarItemAOrdenMedica(int idOrdenMedica, OrdenMedicaItem ordenMedicaItem) {
		getOrdenMedica(idOrdenMedica).agregarItem(ordenMedicaItem);
	}
	/**
	 * @return the respositorioOrdenesMedicas
	 */
	public Repositorio<OrdenMedica> getRespositorioOrdenesMedicas() {
		return respositorioOrdenesMedicas;
	}
	/**
	 * @param respositorioOrdenesMedicas the respositorioOrdenesMedicas to set
	 */
	public void setRespositorioOrdenesMedicas(
			Repositorio<OrdenMedica> respositorioOrdenesMedicas) {
		this.respositorioOrdenesMedicas = respositorioOrdenesMedicas;
	}

}
