package ar.com.tpclinica.negocio.reglas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AdministradorDeReglas {
	private Map mapOperaciones, mapReglaDePresentacion;

	public AdministradorDeReglas() {
		this.mapOperaciones = new HashMap();
		this.mapReglaDePresentacion = new HashMap();
	}

	public void setReglaDePlan(Operacion operacion) {
		if (operacion.getTipo() != 0) {
			if (operacion.getTipo() == 3) {
				Comparar aux = (Comparar) operacion;
				mapOperaciones.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(), aux);
				mapReglaDePresentacion.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(),getReglaDePrestacion(aux));
			}else{
				boolean termino = false;
				OperacionAnd andAux = (OperacionAnd)operacion;
				while (!termino){
					Comparar aux = (Comparar) andAux.getPrimerOperacion();
					mapOperaciones.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(), aux);
					mapReglaDePresentacion.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(),getReglaDePrestacion(aux));
					if (andAux.getSegundaOperacion().getTipo()==3)
					{
						termino = true;
						aux = (Comparar) andAux.getSegundaOperacion();
						mapOperaciones.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(), aux);
						mapReglaDePresentacion.put(((PrestacionesPorOrden) aux.getA()).getPrestacion(),getReglaDePrestacion(aux));
					}else
						andAux = (OperacionAnd)andAux.getSegundaOperacion();
				}
			}
		}
	}

	private ReglaDePrestacion getReglaDePrestacion(Comparar op) {
		ReglaDePrestacion retVal = new ReglaDePrestacion();
		retVal.setPrestacion(((PrestacionesPorOrden) op.getA()).getPrestacion());
		ReglaSimple rs1 = new ReglaSimple();
		setLimitantes((OperacionConOperandos) op.getMayor(), rs1);
		int aux = op.getMayor().getTipo();
		Comparar auxComparar;
		if (aux != 3) {
			Suma auxSuma = (Suma) op.getMayor();
			while (aux != 3) {
				aux = auxSuma.getOp().getTipo();
				if (aux != 3)
					auxSuma = (Suma) auxSuma.getOp();
			}
			auxComparar = (Comparar) auxSuma.getOp();
		} else
			auxComparar = (Comparar) op.getMayor();
		setComparadorYCumple(rs1,auxComparar);
		retVal.setRegla1(rs1);
		if (rs1.getConector().compareTo("Finalizada")!=0)
		{
			ReglaSimple rs2 = new ReglaSimple();
			OperacionConOperandos op2;
			if (rs1.getComparador().compareTo(">")==0)
				if (rs1.getConector().compareTo("Y")==0)
					op2 = (OperacionConOperandos)auxComparar.getMayor();
				else
					op2 = (OperacionConOperandos)auxComparar.getMenor();
			else if (rs1.getComparador().compareTo("<")==0)
					if (rs1.getConector().compareTo("Y")==0)
						op2 = (OperacionConOperandos)auxComparar.getMenor();
					else
						op2 = (OperacionConOperandos)auxComparar.getMayor();
				else 
					if (rs1.getConector().compareTo("Y")==0)
						op2 = (OperacionConOperandos)auxComparar.getIgual();
					else
						op2 = (OperacionConOperandos)auxComparar.getMayor();
			setLimitantes(op2,rs2);
			aux = op2.getTipo();
			if (aux != 3) {
				Suma auxSuma = (Suma) op2;
				while (aux != 3) {
					aux = auxSuma.getOp().getTipo();
					if (aux != 3)
						auxSuma = (Suma) auxSuma.getOp();
				}
				auxComparar = (Comparar) auxSuma.getOp();
			} else
				auxComparar = (Comparar) op2;
			setComparadorYCumple(rs2,auxComparar);
			retVal.setRegla2(rs2);
		}
			return retVal;
	}

	private void setComparadorYCumple(ReglaSimple rs,Comparar cp)
	{
		if (cp.getMayor().getTipo() == cp.getMenor().getTipo())
		{
			if (cp.getMayor().equals(cp.getMenor())){
				if (cp.getMayor().getTipo() == 0)
				{
					rs.setComparador("=");
					rs.setNoCumple(cp.getMayor().aplicar(null).getResultado());
					if (cp.getIgual().getTipo() == 0)
					{
						rs.setCumple(cp.getIgual().aplicar(null).getResultado());
						rs.setConector("Finalizada");
					}else{
						rs.setConector("Y");
					}
				} else {
					rs.setComparador("=");
					rs.setConector("O");
					rs.setCumple(cp.getIgual().aplicar(null).getResultado());
				}
			} else if (cp.getMayor().getTipo() == cp.getIgual().getTipo()) 
						if (cp.getMayor().equals(cp.getIgual()))
						{
							if (cp.getMayor().getTipo() == 0)
							{
								rs.setComparador("<");
								rs.setNoCumple(cp.getMayor().aplicar(null).getResultado());
								if (cp.getMenor().getTipo() == 0)
								{
									rs.setCumple(cp.getMenor().aplicar(null).getResultado());
									rs.setConector("Finalizada");
								}else{
									rs.setConector("Y");
								}
							}else {
								rs.setComparador("<");
								rs.setConector("O");
								rs.setCumple(cp.getMenor().aplicar(null).getResultado());
							}
						}else{
							if (cp.getMenor().getTipo() == 0)
							{
								rs.setComparador(">");
								rs.setNoCumple(cp.getMenor().aplicar(null).getResultado());
								if (cp.getMayor().getTipo() == 0)
								{
									rs.setCumple(cp.getMayor().aplicar(null).getResultado());
									rs.setConector("Finalizada");
								}else{
									rs.setConector("Y");
								}
							}else {
								rs.setComparador(">");
								rs.setConector("O");
								rs.setCumple(cp.getMayor().aplicar(null).getResultado());
							}
						}
				
		} 
	}

	private void setLimitantes(OperacionConOperandos op, ReglaSimple rs) {
		ArrayList<Limitante> retVal = new ArrayList();
		if (op.getTipo() == 3) {
			rs.setLimitante2(getLimitante(op.getSegundoOperando()));
			retVal.add(getLimitante(op.getPrimerOperando()));
			rs.setLimitantes1(retVal);
		} else {
			int aux = 0;
			Suma auxSuma = (Suma) op;
			while (aux != 3) {
				if (!auxSuma.getPrimerOperando().equals(new Cantidad(0)))
					retVal.add(getLimitante(auxSuma.getPrimerOperando()));
				if (!auxSuma.getSegundoOperando().equals(new Cantidad(0)))
					retVal.add(getLimitante(auxSuma.getSegundoOperando()));
				aux = auxSuma.getOp().getTipo();
				if (aux != 3)
					auxSuma = (Suma) auxSuma.getOp();
			}
			rs.setLimitante2(getLimitante(((OperacionConOperandos) auxSuma
					.getOp()).getSegundoOperando()));
			if (!((OperacionConOperandos) auxSuma.getOp()).getPrimerOperando()
					.equals(new Cantidad(0)))
				retVal.add(getLimitante(((OperacionConOperandos) auxSuma
						.getOp()).getPrimerOperando()));
			rs.setLimitantes1(retVal);
		}
	}

	private Limitante getLimitante(Operando op) {
		Limitante retVal = new Limitante();
		if (op.getTipo() == 0) {
			retVal.setNombre("Valor");
			retVal.setValor(Integer.toString(op.getValor(null)));
		} else if (op.getTipo() == 1) {
			retVal.setNombre("Meses");
			retVal.setValor(Integer.toString(op.getValor(null)));
		} else if (op.getTipo() == 2) {
			retVal.setNombre(((PrestacionesPorOrden) op).getPrestacion());
			retVal.setBuscarEn("Orden");
		} else {
			retVal.setNombre(((PrestacionesPorPeriodoConHistorial) op)
					.getPrestacion());
			retVal.setBuscarEn("Historial");
			retVal.setPeriodo(((PrestacionesPorPeriodoConHistorial) op)
					.getPeriodo());
		}
		return retVal;
	}

	public Operacion getReglaDePlan() {
		if (mapOperaciones.isEmpty())
			return new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		else if (mapOperaciones.size() == 1) {
			Iterator it = mapOperaciones.values().iterator();
			return (Operacion) it.next();
		} else {
			Iterator it = mapOperaciones.values().iterator();
			Operacion raiz = null;
			while (it.hasNext()) {
				if (raiz == null)
					raiz = new OperacionAnd((Operacion) it.next(),
							(Operacion) it.next());
				else
					raiz = new OperacionAnd((Operacion) it.next(), raiz);
			}
			return raiz;
		}
	}

	public void setReglaPorPrestacion(ReglaDePrestacion regla) {
		Operacion subRegla1, subRegla2;
		Operacion resultadoVerdadero = new OperacionDeResultadoDirecto(
				new Resultado("Verdadero"));

		ReglaSimple rs1 = regla.getRegla1();
		ReglaSimple rs2 = regla.getRegla2();

		Operacion sr1resultadoNoCumple, sr1resultadoCumple;

		if (rs2 == null)
			subRegla2 = null;
		else
			subRegla2 = getOperacionSubRegla(rs2, getOperandoFromLimitante(rs2
					.getLimitante2()), getOperacionCumpleFromReglaSimple(rs2),
					getOperacionNoCumpleFromReglaSimple(rs2));

		if (subRegla2 == null) {
			sr1resultadoNoCumple = getOperacionNoCumpleFromReglaSimple(rs1);
			sr1resultadoCumple = getOperacionCumpleFromReglaSimple(rs1);
		} else if (rs1.getConector().compareTo("Y") == 0) {
			sr1resultadoNoCumple = getOperacionNoCumpleFromReglaSimple(rs1);
			sr1resultadoCumple = subRegla2;
		} else {
			sr1resultadoCumple = getOperacionCumpleFromReglaSimple(rs1);
			sr1resultadoNoCumple = subRegla2;
		}

		subRegla1 = getOperacionSubRegla(rs1, getOperandoFromLimitante(rs1
				.getLimitante2()), sr1resultadoCumple, sr1resultadoNoCumple);
		Operacion opRaiz = new Comparar(new PrestacionesPorOrden(regla
				.getPrestacion()), new Cantidad(0), subRegla1,
				resultadoVerdadero, resultadoVerdadero);

		this.mapOperaciones.put(regla.getPrestacion(), opRaiz);
		this.mapReglaDePresentacion.put(regla.getPrestacion(), regla);
	}

	private Operacion getOperacionSubRegla(ReglaSimple r, Operando op2,
			Operacion resultadoCumple, Operacion resultadoNoCumple) {
		Iterator<Limitante> it = r.getLimitantes1().iterator();
		Operando op1;
		if (r.getLimitantes1().size() == 1) {
			Limitante l1 = it.next();

			op1 = getOperandoFromLimitante(l1);

			return getComparador(r, op1, op2, resultadoCumple,
					resultadoNoCumple);
		} else {
			OperacionConOperandos suma, comparacion, sumaAux;
			suma = null;
			comparacion = getComparador(r, new Cantidad(0), op2,
					resultadoCumple, resultadoNoCumple);
			while (it.hasNext()) {
				if (suma == null)
					suma = new Suma(new Cantidad(0),
							getOperandoFromLimitante(it.next()), comparacion);
				else
					suma = new Suma(new Cantidad(0),
							getOperandoFromLimitante(it.next()), suma);
			}
			return suma;
		}
	}

	private OperacionConOperandos getComparador(ReglaSimple r, Operando op1,
			Operando op2, Operacion resultadoCumple, Operacion resultadoNoCumple) {
		if (r.getComparador().compareTo(">") == 0)
			return new Comparar(op1, op2, resultadoCumple, resultadoNoCumple,
					resultadoNoCumple);
		else if (r.getComparador().compareTo("<") == 0)
			return new Comparar(op1, op2, resultadoNoCumple, resultadoCumple,
					resultadoNoCumple);
		else
			return new Comparar(op1, op2, resultadoNoCumple, resultadoNoCumple,
					resultadoCumple);
	}

	private Operacion getOperacionCumpleFromReglaSimple(ReglaSimple r) {
		if (r.getCumple().compareTo("Verdadero") == 0)
			return new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		else if (r.getCumple().compareTo("Falso") == 0)
			return new OperacionDeResultadoDirecto(new Resultado("Falso"));
		else
			return new OperacionDeResultadoDirecto(new Resultado("Autorizar"));
	}

	private Operacion getOperacionNoCumpleFromReglaSimple(ReglaSimple r) {
		if (r.getNoCumple().compareTo("Verdadero") == 0)
			return new OperacionDeResultadoDirecto(new Resultado("Verdadero"));
		else if (r.getNoCumple().compareTo("Falso") == 0)
			return new OperacionDeResultadoDirecto(new Resultado("Falso"));
		else
			return new OperacionDeResultadoDirecto(new Resultado("Autorizar"));
	}

	private Operando getOperandoFromLimitante(Limitante l) {
		if (l.getNombre().compareTo("Valor") == 0)
			return new Cantidad(Integer.parseInt(l.getValor()));
		else if (l.getBuscarEn().compareTo("OrdenMedica") == 0)
			return new PrestacionesPorOrden(l.getNombre());
		else
			return new PrestacionesPorPeriodoConHistorial(l.getNombre(), l
					.getPeriodo());
	}

	public void getReglaPorPrestacion(ReglaDePrestacion regla) {
		if (mapReglaDePresentacion.containsKey(regla.getPrestacion()))
			regla = (ReglaDePrestacion) mapReglaDePresentacion.get(regla
					.getPrestacion());
	}

	public void borrarReglaPorPrestacion(ReglaDePrestacion regla) {
		mapOperaciones.remove(regla.getPrestacion());
		mapReglaDePresentacion.remove(regla.getPrestacion());
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
