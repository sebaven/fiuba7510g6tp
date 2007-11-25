package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.*;
import ar.com.tpclinica.persistencia.excepciones.*;


/*	Esta clase es singleton */ 
public class RepositoriosProvider {
	
	private static RepositoriosProvider _instancia = null;
	
	private static RepositorioImp<Prestacion> repoPrestaciones;
	private static RepositorioImp<Especialidad> repoEspecialidades;
	private static RepositorioMedicosImp repoMedicos;
	private static RepositorioImp<Plan> repoPlanes;
	private static RepositorioImp<Paciente> repoPacientes;
	private static RepositorioOrdenesImp repoOrdenes;	
	
	private RepositoriosProvider(){
		repoPrestaciones = new RepositorioImp<Prestacion>();
		repoEspecialidades = new RepositorioImp<Especialidad>();
		repoMedicos = new RepositorioMedicosImp();
		repoOrdenes = new RepositorioOrdenesImp();
		repoPlanes = new RepositorioImp<Plan>();
		repoPacientes = new RepositorioImp<Paciente>();
	}
	
	
	
	public static RepositoriosProvider getInstancia() {
		if (_instancia==null){ 
			_instancia = new RepositoriosProvider();
			Hidratador h = new Hidratador();
			h.hidratarPrestaciones(repoPrestaciones);
			try{
				h.hidratarEspecialidades(repoEspecialidades);
				h.hidratarMedicos(repoMedicos);
				h.hidratarPacientes(repoPacientes);
				h.hidratarOrdenes(repoOrdenes);
				
			}catch(Exception e){System.out.println("Se me pincho");}
			
			
		}
		return _instancia;
	}
	
	public Repositorio<Prestacion> getRepositorioPrestacion(){
		return repoPrestaciones;
	}
	
	public Repositorio<Especialidad> getRepositorioEspecialidad(){
		return repoEspecialidades;
	}
	
	public RepositorioMedicos getRepositorioMedico(){
		return repoMedicos;
	}
	
	public RepositorioOrdenes getRepositorioOrdenes(){
		return repoOrdenes;
	}
	
	public Repositorio<Plan> getRepositorioPlanes(){
		return repoPlanes;
	}
	
	public Repositorio<Paciente> getRepositorioPacientes(){
		return repoPacientes;
	}
}
