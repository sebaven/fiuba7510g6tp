package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.*;


/*	Esta clase es singleton */ 
public class RepositorioFactory {
	
	static RepositorioFactory _instancia = null;
	
	private static RepositorioImp<Prestacion> repoPrestaciones;
	private static RepositorioImp<Especialidad> repoEspecialidades;
	private static RepositorioMedicosImp repoMedicos;
	
	private RepositorioFactory(){
		repoPrestaciones = new RepositorioImp<Prestacion>();
		repoEspecialidades = new RepositorioImp<Especialidad>();
		repoMedicos = new RepositorioMedicosImp();
	}
	
	
	
	public static RepositorioFactory getInstancia(){
		if (_instancia==null){ 
			_instancia = new RepositorioFactory();
			Hidratador h = new Hidratador();
			h.hidratarPrestaciones(repoPrestaciones);
			h.hidratarEspecialidades(repoEspecialidades);
			h.hidratarMedicos(repoMedicos);
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
}
