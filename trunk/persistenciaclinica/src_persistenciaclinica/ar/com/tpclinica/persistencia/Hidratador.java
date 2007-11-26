package ar.com.tpclinica.persistencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.com.tpclinica.negocio.*;
import ar.com.tpclinica.negocio.reglas.*;
import ar.com.tpclinica.negocio.reglas.ResultadoRegla;
import ar.com.tpclinica.persistencia.excepciones.ClaveNoExisteExcepcion;

public class Hidratador {
	
	/** Llena con datos fijos un Repositorio de Prestaciones */
	public void hidratarPrestaciones(Repositorio<Prestacion> repoPrestaciones){
		int cantidad=5;
		Prestacion p[] = new Prestacion[cantidad];
		
		for(int i=0; i<cantidad; i++){
			p[i]= new Prestacion();
		}
		
		p[0]=this.createPrestacion("343","Radiografía");
		p[1]=this.createPrestacion("120", "Análisis de Sangre");
		p[2]=this.createPrestacion("200","Análisis de Orina");
		p[3]=this.createPrestacion("201","Tomografía");
		p[4]=this.createPrestacion("202","Electro Cardiograma");
		
		for(int i=0; i<cantidad; i++){
			p[i].setId(i);
			repoPrestaciones.modify(p[i].getId(), p[i]);
		}
	}
	
	/** Llena con datos fijos un Repositorio de Especialidades 
	 * @throws ClaveNoExisteExcepcion 
	 * @throws ClaveNoExisteExcepcion 
	 * */
	public void hidratarEspecialidades(Repositorio<Especialidad> repoEspecialidades) throws ClaveNoExisteExcepcion{
		
		int cantidad=3;
		Especialidad e[] = new Especialidad[cantidad];
		Repositorio<Prestacion> repPrestacion = RepositoriosProvider.getInstancia().getRepositorioPrestacion();
		
		for(int i=0; i<cantidad; i++){
			e[i]= new Especialidad();
			e[i].setCodigo(i);
		}
		
		e[0].setNombre("Pediatría");
		for (int id=0;id<5;id++){
			Prestacion p = repPrestacion.get(id);
			e[0].agregarPrestacion(p);
		}
			
		
		e[1].setNombre("Oftalmología");
		e[1].agregarPrestacion(repPrestacion.get(0));
		e[1].agregarPrestacion(repPrestacion.get(3));
		
		e[2].setNombre("Dermatología");
		for (int id=1;id<4;id++) e[2].agregarPrestacion(repPrestacion.get(id));
		
		for(int i=0; i<cantidad; i++){
			repoEspecialidades.modify(e[i].getCodigo(), e[i]);
		}
	}
	
	public void hidratarMedicos(RepositorioMedicosImp repo) throws ClaveNoExisteExcepcion{
		int cantidad = 3;
		Repositorio<Especialidad> repEsp = RepositoriosProvider.getInstancia().getRepositorioEspecialidad();
		
		Medico m[] = new Medico[cantidad];
		
		for (int i=0; i<cantidad; i++){
			m[i] = new Medico();
		}
		
		m[0].setNombre("Mariano"); m[0].setApellido("Sanchez");
		m[0].setId(5000); m[0].setEspecialidad(repEsp.get(0));
		
		m[1].setNombre("Emiliano"); m[1].setApellido("Perez");
		m[1].setId(5001); m[1].setEspecialidad(repEsp.get(1));
		
		m[2].setNombre("Laura"); m[2].setApellido("Lopez");
		m[2].setId(5002); m[2].setEspecialidad(repEsp.get(2));		
		
		for (int i=0; i<cantidad; i++){
			repo.modify(m[i].getId(), m[i]);
		}
	}
	
	public void hidratarOrdenes(Repositorio<OrdenMedica> repo) throws ClaveNoExisteExcepcion{
		int cantidad = 3;
		OrdenMedica om[] = new OrdenMedica[cantidad];
		
		Repositorio<Prestacion> repPrestaciones = RepositoriosProvider.getInstancia().getRepositorioPrestacion();
		RepositorioMedicos repMedicos = RepositoriosProvider.getInstancia().getRepositorioMedico();
		Repositorio<Paciente> repPacientes = RepositoriosProvider.getInstancia().getRepositorioPacientes();
		
		for (int i=0; i<cantidad; i++){
			om[i] = new OrdenMedica();
		}
		
		//Orden Medica 0
		om[0].setId(800001);  
		om[0].cambiarEstado(new OrdenMedicaEstado(OrdenMedicaEstado.PENDIENTE_AUTORIZACION));
		om[0].setMedico(repMedicos.get(5000)); //Mariano sanchez, Pediatria
		om[0].setPaciente(repPacientes.get(1130));
		om[0].setDiagnostico("Paciente con dificultades para respirar al realizar ejercicios repentinos");
		om[0].setEnviadaALab(false);
		
		//items
		OrdenMedicaItem it1 = new OrdenMedicaItem();
		it1.setPrestacion(repPrestaciones.get(0)); //radiografia
		it1.setDescripcion("Rx de torax en 50x60");
		om[0].agregarItem(it1);
		
		OrdenMedicaItem it2 = new OrdenMedicaItem();
		it2.setPrestacion(repPrestaciones.get(4)); //Electrocaridograma
		it2.setDescripcion("Con ejercicio fisico previo");
		om[0].agregarItem(it2);
		
		
		//Orden Medica 1
		om[1].setId(800002); 
		om[1].cambiarEstado(new OrdenMedicaEstado(OrdenMedicaEstado.AUTORIZADA));
		om[1].setMedico(repMedicos.get(5002)); //Emiliano Perez, oftalmologia
		om[1].setPaciente(repPacientes.get(1251));
		om[1].setDiagnostico("Revisacion general");
		om[1].setEnviadaALab(false);
		
		//items
		OrdenMedicaItem it3 = new OrdenMedicaItem();
		it3.setPrestacion(repPrestaciones.get(0)); //radiografia
		it3.setDescripcion("Rx de Craneo");
		om[1].agregarItem(it3);

		
		//Orden Medica 2
		om[2].setId(800003); 
		om[2].cambiarEstado(new OrdenMedicaEstado(OrdenMedicaEstado.AUTORIZADA));
		om[2].setMedico(repMedicos.get(5001)); //Laura Lopez, dermatologa
		om[2].setPaciente(repPacientes.get(1255));
		om[2].setDiagnostico("Consulta por manchas solares");
		om[2].setEnviadaALab(true);
		
		//items
		OrdenMedicaItem it4 = new OrdenMedicaItem();
		it4.setPrestacion(repPrestaciones.get(1)); //analisis de sangre
		it4.setDescripcion("Plaquetas, globulos rojos, globulos blancos, glucemia");
		om[2].agregarItem(it4);
		
		OrdenMedicaItem it5 = new OrdenMedicaItem();
		it5.setPrestacion(repPrestaciones.get(2)); //analisis de orina
		it5.setDescripcion("Glucemia");
		om[2].agregarItem(it5);
		
		OrdenMedicaItem it6 = new OrdenMedicaItem();
		it6.setPrestacion(repPrestaciones.get(3)); //tomografia
		it6.setDescripcion("Computada de craneo");
		om[2].agregarItem(it6);
		
		for (int i=0; i<cantidad; i++){
			repo.modify(om[i].getId(),om[i]);
		}
		
	
	}
	
	public void hidratarPacientes(Repositorio<Paciente> repo) throws ClaveNoExisteExcepcion{
		int cantidad = 5;
		Repositorio<Plan> repoPlan = RepositoriosProvider.getInstancia().getRepositorioPlanes();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Paciente p[] = new Paciente[cantidad];
		
		try {
			p[0] = crearPaciente("Gonzalez", "Gonzalo", 30521129, 1130, "gg@mail.com", "4444-5454", repoPlan.get(0), formatter.parse("2007-04-30"));
			p[1] = crearPaciente("Ramirez", "Ramiro", 35641612, 1135, "rr@mail.com", "4452-7878", repoPlan.get(1000), formatter.parse("2006-05-29"));
			p[2] = crearPaciente("Gonzalez", "Ramiro", 28546548, 1211, "rg@mail.com", "4999-5454", repoPlan.get(10000), formatter.parse("2005-06-28"));
			p[3] = crearPaciente("Martinez", "Martin", 21333447, 1251, "mm@mail.com", "4049-7894", repoPlan.get(0), formatter.parse("2004-07-27"));
			p[4] = crearPaciente("Rodriguez", "Rodrigo", 3153478, 1255, "rod@mail.com", "5059-1234", repoPlan.get(10000), formatter.parse("2003-08-2"));
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		for (int i=0; i<cantidad; i++){
			repo.modify(p[i].getId(), p[i]);
		}
		
	}
	
	public void hidratarPlanes(Repositorio<Plan> repo) throws ClaveNoExisteExcepcion{
		int cantidad = 3;
		Plan p[] = new Plan[cantidad];
		Repositorio<Prestacion> repoPres = RepositoriosProvider.getInstancia().getRepositorioPrestacion();
		
		for (int i=0; i<cantidad; i++){
			p[i] = new Plan();
		}
		
		p[0].setId(0);
		Operacion regla = new OperacionDeResultadoDirecto(new ResultadoRegla(OrdenMedicaEstado.CANCELAR_ORDEN));
		p[0].setOperacion(regla);
		
		p[1].setId(1000);
		Operacion regla2 = new OperacionDeResultadoDirecto(new ResultadoRegla(OrdenMedicaEstado.AUTORIZADA));
		p[1].setOperacion(regla2);
		
		p[2].setId(10000);
		ResultadoRegla r1 = new ResultadoRegla(OrdenMedicaEstado.AUTORIZADA);
		ResultadoRegla r2 = new ResultadoRegla(OrdenMedicaEstado.AUTORIZADA);
		ResultadoRegla r3 = new ResultadoRegla(OrdenMedicaEstado.AUTORIZADA);
		ResultadoRegla r4 = new ResultadoRegla(OrdenMedicaEstado.CANCELAR_ORDEN);
		ResultadoRegla r5 = new ResultadoRegla(OrdenMedicaEstado.CANCELAR_ORDEN);
		
		Operacion opD1 = new OperacionDeResultadoDirecto(r1);
		Operacion opD2 = new OperacionDeResultadoDirecto(r2);
		Operacion opD3 = new OperacionDeResultadoDirecto(r3);
		Operacion opD4 = new OperacionDeResultadoDirecto(r4);
		Operacion opD5 = new OperacionDeResultadoDirecto(r5);
		
		Operando presPorOrden = new PrestacionesPorOrden(repoPres.get(3).getDescripcion());
		Operando c0 = new Cantidad(0);
		
		//Operando presHistorial = new PrestacionesPorPeriodoConHistorial(repoPres.get(3).getDescripcion(),365);
		Operando presHistorial = new MesesEnPlan();
		Operando c10 = new Cantidad(10);
		
		Operacion comparar2 = new Comparar(presHistorial,c10,opD5,opD4,opD3);		
		Operacion comparar1 = new Comparar(presPorOrden,c0,comparar2,opD2,opD1);
		
		p[2].setOperacion(comparar1);
		
		for (int i=0; i<cantidad; i++){
			repo.modify(p[i].getId(),p[i]);
		}
		
		
		
		
	}

	/**
	 * Factory method
	 * @param id
	 * @param codigo
	 * @return
	 */
	private Prestacion createPrestacion(String codigo,String descripcion){
		return new Prestacion(codigo,descripcion);
	}
	private Paciente crearPaciente(String ap, String nombre, long dni,
									int id, String mail, String telefono,
									Plan plan, Date fechaInicioPlan){
		Paciente p = new Paciente();
		p.setApellido(ap);
		p.setDni(dni);
		p.setId(id);
		p.setMail(mail);
		p.setNombre(nombre);
		p.setPlan(plan, fechaInicioPlan);
		p.setTelefono(telefono);
		return p;
	}
}
