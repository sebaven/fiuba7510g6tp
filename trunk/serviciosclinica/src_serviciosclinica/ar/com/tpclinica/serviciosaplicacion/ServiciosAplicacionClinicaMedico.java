package ar.com.tpclinica.serviciosaplicacion;

import java.util.Collection;

import ar.com.tpclinica.negocio.Especialidad;
import ar.com.tpclinica.negocio.Medico;
import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.persistencia.excepciones.ClaveNoExisteExcepcion;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;

public class ServiciosAplicacionClinicaMedico extends
		ServiciosAplicacionClinica {

	public Medico getMedico(int idMedico) throws ClaveNoExisteExcepcion {
		return RepositoriosProvider.getInstancia().getRepositorioMedico().get(
				idMedico);
	}

	public void agregarNuevoMedico(Medico medicoAAgregar) {
		RepositoriosProvider.getInstancia().getRepositorioMedico().add(
				medicoAAgregar);
	}

	public void borrarMedico(int idMedico) throws ObjetoNoExisteExcepcion, ClaveNoExisteExcepcion {
		RepositoriosProvider.getInstancia().getRepositorioMedico().borrar(
				getMedico(idMedico));
	}

	public void modificarMedico(int idMedico, Medico medicoAModificar) {
		RepositoriosProvider.getInstancia().getRepositorioMedico().modify(
				idMedico, medicoAModificar);
	}

	public Collection<Medico> getMedicos() {
		return RepositoriosProvider.getInstancia().getRepositorioMedico()
				.getAll();
	}

	public Collection<Especialidad> getEspecialidades() {
		return RepositoriosProvider.getInstancia().getRepositorioEspecialidad().getAll();
	}

}
