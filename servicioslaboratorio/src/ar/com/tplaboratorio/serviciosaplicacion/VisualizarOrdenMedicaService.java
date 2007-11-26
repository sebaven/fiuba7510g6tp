package ar.com.tplaboratorio.serviciosaplicacion;

import java.util.Collection;

import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

class VisualizarOrdenMedicaService implements IVisualizarOrdenMedicaService{

	public Collection<OrdenMedicaLab> getOrdenesMedicas() {
		return RepositoriosProvider.getInstancia().getRepositorioOrdenes().getAll();
	}

}
