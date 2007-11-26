package ar.com.tplaboratorio.servicioremotofacade;

public class ServiciosRemotosFactory {

	private static ServiciosRemotosFactory instance=new ServiciosRemotosFactory();
	
	
	public static ServiciosRemotosFactory getInstance(){
		return instance;
	}
	
	public IServiciosRemotosLParaLaboratorio getServicioRemotoLParaLaboratorio(){
		return new ServiciosRemotosLParaLaboratorio();
	}
}
