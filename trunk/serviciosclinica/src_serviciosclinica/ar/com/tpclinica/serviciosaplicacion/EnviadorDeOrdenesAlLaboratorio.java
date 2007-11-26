package ar.com.tpclinica.serviciosaplicacion;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.OrdenMedicaEstado;
import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.serviciosremotefacade.ServiciosRemotosClinicaFactory;

public class EnviadorDeOrdenesAlLaboratorio extends ServiciosAplicacionClinica {

	public void enviarOrdenesAutorizadas() {
		Collection<OrdenMedica> todasLasOrdenes = RepositoriosProvider
				.getInstancia().getRepositorioOrdenes().getAll();
		CollectionUtils.filter(todasLasOrdenes, new Predicate() {

			public boolean evaluate(Object arg0) {
				OrdenMedica ordenMedica = (OrdenMedica) arg0;
				return ((!ordenMedica.isEnviadaALab()) && (ordenMedica
						.getEstado().getDescripcion()
						.equals(OrdenMedicaEstado.AUTORIZADA)));
			}

		});
		if (!todasLasOrdenes.isEmpty())
			ServiciosRemotosClinicaFactory.getInstance()
					.getServicioRemotoOrdenMedica().enviarOrdenLaboratorio(
							todasLasOrdenes, "lab1");

	}
}
