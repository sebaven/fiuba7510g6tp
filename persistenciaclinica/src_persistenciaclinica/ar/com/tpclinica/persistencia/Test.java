package ar.com.tpclinica.persistencia;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import ar.com.tpclinica.negocio.*;
import ar.com.tpclinica.negocio.exepciones.OrdenMedicaInvalidaException;
import ar.com.tpclinica.persistencia.excepciones.ClaveNoExisteExcepcion;

public class Test {

	private Repositorio<Prestacion> repPrestaciones;
	private Repositorio<Especialidad> repoEspec;		
	private RepositorioMedicos repoMedicos;
	private Repositorio<Paciente> repoPacientes;
	private Repositorio<Plan> repoPlanes;
	private RepositorioOrdenes repoOrden;
	
	public Test(){
		repPrestaciones = RepositoriosProvider.getInstancia().getRepositorioPrestacion();
		repoEspec = RepositoriosProvider.getInstancia().getRepositorioEspecialidad();
		repoMedicos = RepositoriosProvider.getInstancia().getRepositorioMedico();
		repoPacientes = RepositoriosProvider.getInstancia().getRepositorioPacientes();
		repoPlanes = RepositoriosProvider.getInstancia().getRepositorioPlanes();
		repoOrden = RepositoriosProvider.getInstancia().getRepositorioOrdenes();
	}
	
	
	public void testPrestaciones() throws Exception{
		
		Prestacion p = repPrestaciones.get(2);
		System.out.println(p.getDescripcion());
		Prestacion p2 = repPrestaciones.get(3);
		System.out.println(p2.getDescripcion());
		
		repPrestaciones.borrar(p2);
		
		p = repPrestaciones.get(2);
		System.out.println(p.getDescripcion());
		if (repPrestaciones.existe(p2)){
			p = repPrestaciones.get(3);
			System.out.println(p.getDescripcion());
		}else{
			System.out.println("No existe la prestacion " + p2.getDescripcion());
		}
		
		p = repPrestaciones.get(4);
		System.out.println(p.getDescripcion());
		
		p=new Prestacion();
		p.setDescripcion("Algo adicional");
		repPrestaciones.add(p);
		
	}
	
	public void testEspecialidades() throws Exception{

		System.out.println("Testeo Especialidades");
		
		Especialidad e = repoEspec.get(0);
		Collection<Prestacion> c = e.getPrestaciones();
		Iterator it = c.iterator();
		while (it.hasNext()){
			System.out.println(e.getNombre() + " " + ((Prestacion)it.next()).getDescripcion());
		}
		
		e = repoEspec.get(1);
		c = e.getPrestaciones();
		it = c.iterator();
		while (it.hasNext()){
			System.out.println(e.getNombre() + " " + ((Prestacion)it.next()).getDescripcion());
		}
		
		e = repoEspec.get(2);
		c = e.getPrestaciones();
		it = c.iterator();
		while (it.hasNext()){
			System.out.println(e.getNombre() + " " + ((Prestacion)it.next()).getDescripcion());
		}
		
	}
	
	public void testMedicos()throws Exception{

		System.out.println("Testeo Medicos");
		
		Collection<Medico> medicos = repoMedicos.getAll();
		Iterator it = medicos.iterator();
		
		while (it.hasNext()){
			Medico m = (Medico)it.next();
			Collection<Prestacion> prestPosibles = m.getPosiblesItemsOrdenMedicas();
			Iterator itPrest = prestPosibles.iterator();
			while (itPrest.hasNext()){
				System.out.println(m.getNombreCompleto() + " puede recetar " + ((Prestacion)itPrest.next()).getDescripcion());
			}
		}
		
		Medico m = repoMedicos.get(5001);
		System.out.println(m.getNombreCompleto());
		
	}
	
	public void testPacientes()throws Exception{

		System.out.println("Testeo Pacientes");
		
		Collection<Paciente> pacientes = repoPacientes.getAll();
		Iterator it = pacientes.iterator();
		
		while (it.hasNext()){
			Paciente p = (Paciente)it.next();
			System.out.println(p.getNombre()+ " " + p.getApellido());
		}
		
		repoPacientes.print();
		
		Paciente p = repoPacientes.get(1251);
		System.out.println(p.getMail());
		
	}
	
	public void testPlanes(){
		System.out.println("Testeo Planes");
		for(OrdenMedica orden:repoOrden.getAll()){
			try {
				orden.setEstado(new OrdenMedicaEstado(orden.getPaciente().getPlan().validarOrden(orden).getResultado()));
				System.out.println("La orden Medica ("+orden.getId()+") fue: " + orden.getEstado().getDescripcion());
			} catch (OrdenMedicaInvalidaException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param args
	 */
	//Descomentar para probar las reglas!!!!! si no esta implementado el resto
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		try{
		t.testPrestaciones();
		t.testEspecialidades();
		t.testMedicos();
		t.testPacientes();
		t.testPlanes();
		}catch(Exception e){e.printStackTrace();}
	}*/
		
}
