package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.HashMap;

import ar.com.tpclinica.negocio.Especialidad;
import ar.com.tpclinica.negocio.Medico;

public class RepositorioMedicosImp implements RepositorioMedicos {

	private HashMap<Integer, Medico> _medicos;
	static RepositorioMedicosImp _instancia = null;
	
	// Métodos estáticos para implementar Singleton	
	static RepositorioMedicosImp getInstancia(){
		if (_instancia==null) _instancia = new RepositorioMedicosImp();
		return _instancia;
	}

	//constructor privado.
	/* Se instancian en memoria varios objetos de tipo Medico, a fin de 
	 * demostrar el funcionamiento que tendría un repositorio.
	 * */
	private RepositorioMedicosImp(){
		
	}
	
	public Medico getByEspecialidad(Especialidad e) {
		// TODO Auto-generated method stub
		return null;
	}

	public int add(Medico o) {
		// TODO Auto-generated method stub
return -19;
	}

	public void borrar(Medico o) {
		// TODO Auto-generated method stub

	}

	public boolean existe(Medico o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Medico get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Medico> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
