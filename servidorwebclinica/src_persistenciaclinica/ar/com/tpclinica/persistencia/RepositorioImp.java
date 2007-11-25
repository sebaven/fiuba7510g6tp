package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class RepositorioImp <E> implements Repositorio<E> {

	private ConcurrentHashMap<Integer, E> coleccion;
	private int num = 0;
	
	RepositorioImp(){
		coleccion = new ConcurrentHashMap<Integer, E>();
	}

	/**
	 * Los elementos del repositorio tiene un id, ese id deberia ser el del mapa ¿no?
	 */
	public int add(E o) {
		// si el id ya está siendo utilizado, busco el siguiente libre
		while (coleccion.keySet().contains(num))
			num++;
		
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
		return (Collection<E>)coleccion.values();
	}

	
	/** Si la clave no existe, agrega la entrada.
	 *  Si la clave existe, modifica el contenido de dicha clave*/
	public void modify(int clave, E o) {
		if (!coleccion.keySet().contains(clave)){
			coleccion.put(clave, o);
		}else{
			coleccion.replace(clave, o);
		}
	}
	

}
