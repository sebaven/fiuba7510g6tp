package ar.com.tpclinica.serviciosaplicacion;

import ar.com.tpclinica.negocio.Paciente;
import ar.com.tpclinica.persistencia.Repositorio;

public class ServiciosAplicacionClinicaPaciente extends
		ServiciosAplicacionClinica {
	private Repositorio<Paciente> repositorioPacientes;
	public Paciente getPaciente(int idPaciente) {
		return repositorioPacientes.get(idPaciente);
	}
	public Paciente crearNuevoPaciente(String nombre, String apellido, int idPlan) {
		return null;
	}
	public void modificarPaciente(int idPaciente, String nombre, String apellido, int idPlan) {
		
	}
	public void borrarPaciente(int idPaciente) {
		repositorioPacientes.borrar(getPaciente(idPaciente));
	}

}
