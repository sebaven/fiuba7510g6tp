package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.*;


/*	Esta clase es singleton */ 
public class RepositoriosProvider {
	
	static RepositoriosProvider _instancia = null;
	
	private static RepositorioImp<Prestacion> repoPrestaciones;
	private static RepositorioImp<Especialidad> repoEspecialidades;
	private static RepositorioMedicosImp repoMedicos;
	private static RepositorioImp<Plan> repoPlanes;
	private static RepositorioOrdenesImp repoOrdenes;
	
	private RepositoriosProvider(){
		repoPrestaciones = new RepositorioImp<Prestacion>();
		repoEspecialidades = new RepositorioImp<Especialidad>();
		repoMedicos = new RepositorioMedicosImp();
		repoOrdenes = new RepositorioOrdenesImp();
		repoPlanes = new RepositorioImp<Plan>();
	}
	
	
	
	public static RepositoriosProvider getInstancia(){
		if (_instancia==null){ 
			_instancia = new RepositoriosProvider();
			Hidratador h = new Hidratador();
			h.hidratarPrestaciones(repoPrestaciones);
			h.hidratarEspecialidades(repoEspecialidades);
			h.hidratarMedicos(repoMedicos);
			h.hidratarOrdenes(repoOrdenes);
		}
		return _instancia;
	}
	
	public RepositorioImp<Prestacion> getRepositorioPrestacion(){
		return repoPrestaciones;
	}
	
	public RepositorioImp<Especialidad> getRepositorioEspecialidad(){
		return repoEspecialidades;
	}
	
	public RepositorioMedicosImp getRepositorioMedico(){
		return repoMedicos;
	}
	
	public RepositorioOrdenesImp getRepositorioOrdenes(){
		return repoOrdenes;
	}
	
	public RepositorioImp<Plan> getRepositorioPlanes(){
		return repoPlanes;
	}
}
