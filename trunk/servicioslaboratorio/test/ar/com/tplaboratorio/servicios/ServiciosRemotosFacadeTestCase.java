package ar.com.tplaboratorio.servicios;

import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;
import ar.com.tplaboratorio.servicioremotofacade.IServiciosRemotosLParaLaboratorio;
import ar.com.tplaboratorio.servicioremotofacade.ServiciosRemotosFactory;
import junit.framework.TestCase;

public class ServiciosRemotosFacadeTestCase extends TestCase {

	public void testRemoteInvocationFacade(){
		IServiciosRemotosLParaLaboratorio servicio=ServiciosRemotosFactory.getInstance().getServicioRemotoLParaLaboratorio();
		OrdenMedicaLab orden=RepositoriosProvider.getInstancia().getRepositorioOrdenes().get(1);
		servicio.enviarResultadoOrdenMedica(orden);
	}
}
