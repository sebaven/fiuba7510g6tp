package ar.com.tpclinica.serviciosaplicacion;

import ar.com.tpclinica.negocio.Plan;
import ar.com.tpclinica.persistencia.Repositorio;
import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.persistencia.excepciones.ClaveNoExisteExcepcion;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;

public class ServiciosAplicacionClinicaPlan extends ServiciosAplicacionClinica {
	public Plan getPlan(int idPlan) throws ClaveNoExisteExcepcion {
		return RepositoriosProvider.getInstancia().getRepositorioPlanes().get(
				idPlan);
	}

	public void crearNuevoPlan(Plan plan) {
		RepositoriosProvider.getInstancia().getRepositorioPlanes().add(plan);
	}

	public void borrarPlan(int idPlan) throws ObjetoNoExisteExcepcion, ClaveNoExisteExcepcion {
		RepositoriosProvider.getInstancia().getRepositorioPlanes().borrar(this.getPlan(idPlan));
	}

	public void modificarPlan(int idPlan, Plan planAModificar) {
		RepositoriosProvider.getInstancia().getRepositorioPlanes().modify(idPlan, planAModificar);
	}


}
