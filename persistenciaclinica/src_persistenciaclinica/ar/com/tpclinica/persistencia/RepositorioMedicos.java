package ar.com.tpclinica.persistencia;

import java.util.Collection;

import ar.com.tpclinica.negocio.Especialidad;
import ar.com.tpclinica.negocio.Medico;

public interface RepositorioMedicos extends Repositorio<Medico> {
	public Collection<Medico> getByEspecialidad(Especialidad e);
}
