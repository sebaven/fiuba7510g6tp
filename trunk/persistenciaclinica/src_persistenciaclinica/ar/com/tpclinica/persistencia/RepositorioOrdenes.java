package ar.com.tpclinica.persistencia;

import java.util.Collection;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.Paciente;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;

public interface RepositorioOrdenes extends Repositorio<OrdenMedica>{

	public OrdenMedica getPorNroOrden(int nroOrden) throws ObjetoNoExisteExcepcion;
	
	public Collection <OrdenMedica> getPorPaciente(Paciente p);
}
