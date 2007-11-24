package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class RepositorioImp <E> implements Repositorio<E> {

	private ConcurrentHashMap<Integer, E> coleccion;
	private int num = 0;
	
	RepositorioImp(){
		coleccion = new ConcurrentHashMap<Integer, E>();
	}

	public int add(E o) {
		coleccion.put(num++, o);
		return num-1;
	}

	public void borrar(E o) {
		coleccion.values().remove(o);
	}

	public boolean existe(E o) {
		return coleccion.values().contains(o);
	}

	public E get(int id) {
		return coleccion.get(id);
	}

	public Collection<E> getAll() {
		return coleccion.values();
	}

}
