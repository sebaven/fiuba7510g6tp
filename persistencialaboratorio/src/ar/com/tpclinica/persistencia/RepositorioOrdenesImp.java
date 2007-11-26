package ar.com.tpclinica.persistencia;


import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

class RepositorioOrdenesImp extends RepositorioImp<OrdenMedicaLab> implements RepositorioOrdenes {

	/**
	 * NO es lo mismo un id que un nroOrden, no es lo mismo un codigoPrestacion que un id.
	 * 
	 */
	public OrdenMedicaLab getPorNroOrden(final int nroOrden) {
		
		return (OrdenMedicaLab) CollectionUtils.find(this.getAll(),new Predicate(){

			public boolean evaluate(Object arg0) {
				return ((OrdenMedicaLab)arg0).getId()==nroOrden;
			}
			
		});
	}

	
	
	
	
	
}
