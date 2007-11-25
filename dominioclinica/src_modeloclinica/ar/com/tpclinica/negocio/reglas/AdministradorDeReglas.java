package ar.com.tpclinica.negocio.reglas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AdministradorDeReglas {
private Map mapOperaciones,mapReglaDePresentacion;
	
	public AdministradorDeReglas() {
		this.mapOperaciones = new HashMap();
		this.mapReglaDePresentacion = new HashMap();
	}
	
	public void setReglaDePlan(Operacion operacion) {
		
	}
	public Operacion getReglaDePlan() {
		return null;
	}
	public void setReglaPorPrestacion(ReglaDePrestacion regla) {
		Operacion subRegla1,subRegla2;
		Operacion resultadoVerdadero = new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		
		ReglaSimple rs1 = regla.getRegla1();
		ReglaSimple rs2 = regla.getRegla2();
		
		Operacion sr1resultadoNoCumple,sr1resultadoCumple;
		
		if (rs2 == null)
			subRegla2 = null;
		else
			subRegla2 = getOperacionSubRegla(rs2,getOperandoFromLimitante(rs2.getLimitante2()),getOperacionCumpleFromReglaSimple(rs2),getOperacionNoCumpleFromReglaSimple(rs2));
		
		if (subRegla2 == null)
		{
			sr1resultadoNoCumple = getOperacionNoCumpleFromReglaSimple(rs1);
			sr1resultadoCumple = getOperacionCumpleFromReglaSimple(rs1);
		}
		else if (rs1.getConector().compareTo("Y")==0)
		{
			sr1resultadoNoCumple = getOperacionNoCumpleFromReglaSimple(rs1);
			sr1resultadoCumple = subRegla2;
		} else {
			sr1resultadoCumple = getOperacionCumpleFromReglaSimple(rs1);
			sr1resultadoNoCumple = subRegla2;
		}
			
		subRegla1 = getOperacionSubRegla(rs1,getOperandoFromLimitante(rs1.getLimitante2()),sr1resultadoCumple,sr1resultadoNoCumple);
		Operacion opRaiz = new Comparar(new PrestacionesPorOrden(regla.getPrestacion()),new Cantidad(0),subRegla1,resultadoVerdadero,resultadoVerdadero);
		
		this.mapOperaciones.put(regla.getPrestacion(),opRaiz);
		this.mapReglaDePresentacion.put(regla.getPrestacion(),regla);
	}
	
	private Operacion getOperacionSubRegla(ReglaSimple r,Operando op2,Operacion resultadoCumple,Operacion resultadoNoCumple)
	{
		Iterator<Limitante> it = r.getLimitantes1().iterator();
		Operando op1;
		if (r.getLimitantes1().size()==1)
		{
			Limitante l1 = it.next();
			
			op1 = getOperandoFromLimitante(l1);
			
			return getComparador (r,op1,op2,resultadoCumple,resultadoNoCumple);
		}else{
			OperacionConOperandos suma,comparacion,sumaAux;
			suma = null;
			comparacion = getComparador (r,new Cantidad(0),op2,resultadoCumple,resultadoNoCumple);
			while (it.hasNext())
			{
				if (suma == null)
					suma = new Suma(new Cantidad(0),getOperandoFromLimitante(it.next()),comparacion);
				else
					suma = new Suma (new Cantidad(0),getOperandoFromLimitante(it.next()),suma);
			}
			return suma;
		}
	}
	
	private OperacionConOperandos getComparador (ReglaSimple r,Operando op1,Operando op2,Operacion resultadoCumple,Operacion resultadoNoCumple)
	{
		if (r.getComparador().compareTo(">")==0)
			return new Comparar(op1,op2,resultadoCumple,resultadoNoCumple,resultadoNoCumple);
		else if (r.getComparador().compareTo("<")==0)
			return new Comparar(op1,op2,resultadoNoCumple,resultadoCumple,resultadoNoCumple);
			else 
				return new Comparar(op1,op2,resultadoNoCumple,resultadoNoCumple,resultadoCumple);
	}
	
	private Operacion getOperacionCumpleFromReglaSimple(ReglaSimple r)
	{
		if(r.getCumple().compareTo("Verdadero")==0)
			return new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		else if (r.getCumple().compareTo("Falso")==0)
			return new OperacionDeResultadoDirecto(new Resultado("Falso"));
			else return new OperacionDeResultadoDirecto(new Resultado("Autorizar"));
	}
	
	private Operacion getOperacionNoCumpleFromReglaSimple(ReglaSimple r)
	{
		if(r.getNoCumple().compareTo("Verdadero")==0)
			return  new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		else if (r.getNoCumple().compareTo("Falso")==0)
			return  new OperacionDeResultadoDirecto(new Resultado("Falso"));
			else return  new OperacionDeResultadoDirecto(new Resultado("Autorizar"));
	}
	
	private Operando getOperandoFromLimitante(Limitante l)
	{
		if (l.getNombre().compareTo("Valor")==0)
			return new Cantidad(Integer.parseInt(l.getValor()));
		else if (l.getBuscarEn().compareTo("OrdenMedica")==0)
			return new PrestacionesPorOrden(l.getNombre());
			else return new PrestacionesPorPeriodoConHistorial(l.getNombre(),l.getPeriodo());
	}
	public void getReglaPorPrestacion(ReglaDePrestacion regla) {
		if (mapReglaDePresentacion.containsKey(regla.getPrestacion()))
			regla = (ReglaDePrestacion)mapReglaDePresentacion.get(regla.getPrestacion());
	}
	public void borrarReglaPorPrestacion(ReglaDePrestacion regla) {
		
	}

	public Map getMapOperaciones() {
		return mapOperaciones;
	}

	public void setMapOperaciones(Map mapOpercaiones) {
		this.mapOperaciones = mapOpercaiones;
	}

	public Map getMapReglaDePresentacion() {
		return mapReglaDePresentacion;
	}

	public void setMapReglaDePresentacion(Map mapReglaDePresentacion) {
		this.mapReglaDePresentacion = mapReglaDePresentacion;
	}

	

}
