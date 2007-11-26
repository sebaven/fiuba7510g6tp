package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.LinkedList;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.Paciente;
import ar.com.tpclinica.persistencia.excepciones.ObjetoNoExisteExcepcion;

class RepositorioOrdenesImp extends RepositorioImp<OrdenMedica> implements RepositorioOrdenes {

	/**
	 * NO es lo mismo un id que un nroOrden, no es lo mismo un codigoPrestacion que un id.
	 * @throws ObjetoNoExisteExcepcion 
	 * 
	 */
	public OrdenMedica getPorNroOrden(final int nroOrden) throws ObjetoNoExisteExcepcion {
		System.out.println(this.getAll().size());
	OrdenMedica orden=(OrdenMedica) CollectionUtils.find(this.getAll(),new Predicate(){

			public boolean evaluate(Object arg0) {
				System.out.println(((OrdenMedica)arg0).getId());
				return ((OrdenMedica)arg0).getId()==nroOrden;
			}
			
		});
	if (orden==null){
		throw new ObjetoNoExisteExcepcion();
	}
	return orden;
	}

	public Collection<OrdenMedica> getPorPaciente(Paciente p) {
		Collection<OrdenMedica> ordenes = this.getAll();
		LinkedList<OrdenMedica> resultado = new LinkedList<OrdenMedica>();
		for (OrdenMedica orden:ordenes){
			if (orden.getPaciente().getId()==p.getId()) resultado.add(orden);
		}
		return resultado;
	}

	
	
	
	
	
}
