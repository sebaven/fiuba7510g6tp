package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.OrdenMedica;

public interface RepositorioOrdenes extends Repositorio<OrdenMedica>{

	public OrdenMedica getPorNroOrden(int nroOrden);
}
