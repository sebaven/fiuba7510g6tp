package ar.com.tpclinica.persistencia;

import java.util.Collection;

public interface Repositorio<E> {
	public Collection<E> getAll();
	public E get(int id);
	public void add(E o);
	public void borrar(E o);
	public boolean existe(E o);

}
