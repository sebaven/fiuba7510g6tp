package ar.com.tpclinica.serviciosaplicacion;

import ar.com.tpclinica.negocio.Paciente;
import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.persistencia.excepciones.ClaveNoExisteExcepcion;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;

public class ServiciosAplicacionClinicaPaciente extends
		ServiciosAplicacionClinica {

	public Paciente getPaciente(int idPaciente) throws ClaveNoExisteExcepcion {
		return RepositoriosProvider.getInstancia().getRepositorioPacientes()
				.get(idPaciente);
	}

	public void crearNuevoPaciente(Paciente paciente) {
		RepositoriosProvider.getInstancia().getRepositorioPacientes().add(
				paciente);
	}

	public void modificarPaciente(Paciente paciente)
			throws ClaveNoExisteExcepcion {
		RepositoriosProvider.getInstancia().getRepositorioPacientes().modify(
				paciente.getId(), paciente);

	}

	public void borrarPaciente(int idPaciente) throws ObjetoNoExisteExcepcion,
			ClaveNoExisteExcepcion {
		RepositoriosProvider.getInstancia().getRepositorioPacientes().borrar(
				this.getPaciente(idPaciente));
	}

}
