package ar.com.tpclinica.persistencia;
import ar.com.tpclinica.persistencia.Repositorio;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

public interface RepositorioOrdenes extends Repositorio<OrdenMedicaLab>{

	public OrdenMedicaLab getPorNroOrden(int nroOrden);
}
