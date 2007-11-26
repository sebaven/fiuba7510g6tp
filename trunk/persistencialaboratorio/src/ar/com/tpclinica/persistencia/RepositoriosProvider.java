
package ar.com.tpclinica.persistencia;

/*	Esta clase es singleton */ 

public class RepositoriosProvider {
	
	private static RepositoriosProvider _instancia = null;
	
	private static RepositorioOrdenesImp repoOrdenes;	
	
	private RepositoriosProvider(){
		repoOrdenes = new RepositorioOrdenesImp();
	}
	
	
	
	public static RepositoriosProvider getInstancia(){
		if (_instancia==null){ 
			_instancia = new RepositoriosProvider();
		}
		return _instancia;
	}
	

	
	public RepositorioOrdenes getRepositorioOrdenes(){
		return repoOrdenes;
	}
	

}
