package ar.com.tpclinica.persistencia;

import ar.com.tpclinica.negocio.*;

public class Hidratador {
	
	/** Llena con datos fijos un Repositorio de Prestaciones */
	public void hidratarPrestaciones(Repositorio<Prestacion> repoPrestaciones){
		int cantidad=5;
		Prestacion p[] = new Prestacion[cantidad];
		
		for(int i=0; i<cantidad; i++){
			p[i]= new Prestacion();
		}
		
		p[0].setDescripcion("Radiografía");
		p[1].setDescripcion("Análisis de Sangre");
		p[2].setDescripcion("Análisis de Orina");
		p[3].setDescripcion("Tomografía");
		p[4].setDescripcion("Electro Cardiograma");
		
		for(int i=0; i<cantidad; i++){
			p[i].setId(i);
			repoPrestaciones.add(p[i]);
		}
	}
	
	/** Llena con datos fijos un Repositorio de Especialidades */
	public void hidratarEspecialidades(Repositorio<Especialidad> repoEspecialidades){
		
		int cantidad=3;
		Especialidad e[] = new Especialidad[cantidad];
		Repositorio<Prestacion> repPrestacion = RepositorioFactory.getInstancia().getRepositorioPrestacion();
		
		for(int i=0; i<cantidad; i++){
			e[i]= new Especialidad();
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
			repoEspecialidades.add(e[i]);
		}
	}
}
