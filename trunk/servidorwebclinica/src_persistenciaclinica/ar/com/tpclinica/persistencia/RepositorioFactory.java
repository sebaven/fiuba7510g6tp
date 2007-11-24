package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.*;


/*	Esta clase es singleton */ 
public class RepositorioFactory {
	
	static RepositorioFactory _instancia = null;
	
	private static RepositorioImp<Prestacion> repoPrestaciones;
	private static RepositorioImp<Especialidad> repoEspecialidades;
	
	private RepositorioFactory(){
		repoPrestaciones = new RepositorioImp<Prestacion>();
		repoEspecialidades = new RepositorioImp<Especialidad>();
	}
	
	
	
	public static RepositorioFactory getInstancia(){
		if (_instancia==null){ 
			_instancia = new RepositorioFactory();
			Hidratador h = new Hidratador();
			h.hidratarPrestaciones(repoPrestaciones);
			h.hidratarEspecialidades(repoEspecialidades);
		}
		return _instancia;
	}
	
	public RepositorioImp<Prestacion> getRepositorioPrestacion(){
		return repoPrestaciones;
	}
	
	public RepositorioImp<Especialidad> getRepositorioEspecialidad(){
		return repoEspecialidades;
	}
}
