package ar.com.tpclinica.serviciosremotefacade;

import ar.com.tpclinica.persistencia.RepositoriosProvider;
import ar.com.tpclinica.servicios.interfaces.ISerrvicioRemotoOrdenMedica;
import junit.framework.TestCase;

/**
 * 
 * @author carlos
 *
 */
public class RemoteFacadeTestCase extends TestCase {

	/**
	 * Testeamos que funcione correctamente el facade que llama al servicio remoto de otra aplicacion web
	 */
	public void testRemoteFacade(){
		
		ISerrvicioRemotoOrdenMedica servicio=ServiciosRemotosClinicaFactory.getInstance().getServicioRemotoOrdenMedica();
		servicio.enviarOrdenLaboratorio(RepositoriosProvider.getInstancia().getRepositorioOrdenes().getAll(), "");
		
	}
}
