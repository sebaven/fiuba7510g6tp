package ar.com.tpclinica.persistencia;

import java.util.Collection;

import ar.com.tpclinica.persistencia.excepciones.*;

public interface Repositorio<E> {
	public Collection<E> getAll();
	public E get(int id) throws ClaveNoExisteExcepcion;
	public int add(E o);
	
	public void print();
	//agrega la entrada si no existe
	public void modify(int clave, E o);
	public void borrar(E o) throws ObjetoNoExisteExcepcion;
	public boolean existe(E o);

}
