package ar.com.tplaboratorio.serviciosaplicacion;

public class ServiciosAplicacionFactory {

	private static ServiciosAplicacionFactory instance=new ServiciosAplicacionFactory();
	public static ServiciosAplicacionFactory getInstance(){
		return instance;
	}
	
	public IVisualizarOrdenMedicaService getVisualizarOrdenMedicaService(){
		return new VisualizarOrdenMedicaService();
	}
}
