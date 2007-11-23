package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.Especialidad;
import ar.com.tpclinica.negocio.Medico;

public interface RepositorioMedicos extends Repositorio<Medico> {
	public Medico getByEspecialidad(Especialidad e);
}
