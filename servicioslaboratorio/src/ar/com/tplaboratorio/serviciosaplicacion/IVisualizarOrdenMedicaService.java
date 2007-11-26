package ar.com.tplaboratorio.serviciosaplicacion;

import java.util.Collection;

import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

public interface IVisualizarOrdenMedicaService {
	public Collection<OrdenMedicaLab> getOrdenesMedicas();
}
