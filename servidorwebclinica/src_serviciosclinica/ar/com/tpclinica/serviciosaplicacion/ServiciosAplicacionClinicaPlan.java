package ar.com.tpclinica.serviciosaplicacion;

import ar.com.tpclinica.negocio.Plan;
import ar.com.tpclinica.persistencia.Repositorio;

public class ServiciosAplicacionClinicaPlan extends ServiciosAplicacionClinica {
	private Repositorio<Plan> repositorioPlanes;
	public Plan getPlan(int idPlan) {
		return repositorioPlanes.get(idPlan);
	}
	public Plan crearNuevoPlan(String nombre, String regla) {
		return null;
	}
	public void borrarPlan(int idPlan) {
		repositorioPlanes.borrar(getPlan(idPlan));
	}
	public void modificarPlan(int idPlan) {
		
	}
	/**
	 * @return the repositorioPlanes
	 */
	public Repositorio<Plan> getRepositorioPlanes() {
		return repositorioPlanes;
	}
	/**
	 * @param repositorioPlanes the repositorioPlanes to set
	 */
	public void setRepositorioPlanes(Repositorio<Plan> repositorioPlanes) {
		this.repositorioPlanes = repositorioPlanes;
	}

}
