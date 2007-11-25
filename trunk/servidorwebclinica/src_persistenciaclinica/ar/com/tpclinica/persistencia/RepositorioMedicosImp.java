package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

import ar.com.tpclinica.negocio.Especialidad;
import ar.com.tpclinica.negocio.Medico;

public class RepositorioMedicosImp extends RepositorioImp<Medico> implements RepositorioMedicos {

	private ConcurrentHashMap<Integer, Medico> coleccion;
	
	public RepositorioMedicosImp(){
		coleccion = new ConcurrentHashMap<Integer, Medico>();
	}
	
	
	public Collection<Medico> getByEspecialidad(Especialidad e) {
		//voy a ir almacenando los medicos que matcheen con la especialidad en esta lista
		LinkedList<Medico> resultados = new LinkedList<Medico>();
		
		//voy recorriendo la lista completa de médicos
		Iterator it = coleccion.values().iterator();
		while (it.hasNext()){
			Medico m = (Medico)it.next();
			if (m.getEspecialidad().getCodigo()==e.getCodigo()){
				resultados.add(m);
			}
			
		}
		return resultados;
	}



}
