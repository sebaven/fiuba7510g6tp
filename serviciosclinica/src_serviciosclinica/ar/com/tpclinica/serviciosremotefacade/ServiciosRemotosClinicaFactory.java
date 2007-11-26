package ar.com.tpclinica.serviciosremotefacade;

import ar.com.tpclinica.servicios.interfaces.ISerrvicioRemotoOrdenMedica;

/**
 * Crea los diferentes servicios para utilizar este componente.
 * @author carlos
 *
 */
public class ServiciosRemotosClinicaFactory {

	private static ServiciosRemotosClinicaFactory instance=new ServiciosRemotosClinicaFactory();
	
	public static ServiciosRemotosClinicaFactory getInstance(){
		return instance;
	}
	
	public ISerrvicioRemotoOrdenMedica getServicioRemotoOrdenMedica(){
		return new ServiciosRemotosCParaClinica();
	}
}
