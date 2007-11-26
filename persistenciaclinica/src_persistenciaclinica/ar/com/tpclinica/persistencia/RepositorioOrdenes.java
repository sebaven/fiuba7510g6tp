package ar.com.tpclinica.persistencia;

import java.util.Collection;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.Paciente;

public interface RepositorioOrdenes extends Repositorio<OrdenMedica>{

	public OrdenMedica getPorNroOrden(int nroOrden);
	
	public Collection <OrdenMedica> getPorPaciente(Paciente p);
}
