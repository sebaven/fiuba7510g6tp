package ar.com.tpclinica.negocio.reglas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ar.com.tpclinica.negocio.OrdenMedica;

public class PrestacionesPorPeriodoConHistorial extends Operando {
	private int periodo;
	private String prestacion;
	
	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the prestacion
	 */
	public String getPrestacion() {
		return prestacion;
	}

	/**
	 * @param prestacion the prestacion to set
	 */
	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}

	public PrestacionesPorPeriodoConHistorial(String presta, int perio) {
		periodo = perio;
		prestacion = presta;
		this.setTipo(3);
	}
	
	public int getValor(OrdenMedica om)
	{
		// en ese tiempo, cuántas veces aparece la prestac. en el historial
        Calendar lTemp = new GregorianCalendar();
        lTemp.setTime( new Date() );
        lTemp.add( lTemp.DAY_OF_MONTH, -1 * this.periodo);
        Date fechaInicial = new Date(lTemp.getTimeInMillis());
		int cant_veces = 0;

		System.out.println("this.prestacion=" + this.prestacion);
		for (OrdenMedica omActual : om.getPaciente().getOrdenesMedicas()) {
			if (omActual.getFechaOrden().after(fechaInicial)) { // se tiene en cuenta a la orden
				System.out.println("orden.fecha=" + omActual.getFechaOrden().toString());
				for (ar.com.tpclinica.negocio.OrdenMedicaItem omi : omActual.getItems()) { // se itera sobre los items
					System.out.println("omi:");
					omi.getPrestacion();
					//System.out.println("omi.id=" + omi.getPrestacion().getId());
					System.out.println("omi.cod=" + omi.getPrestacion().getCodigo());
					System.out.println("omi.desc=" + omi.getPrestacion().getDescripcion());
					if (omi.getPrestacion().getDescripcion().equals(this.prestacion)) // es esta Prestacion... se la cuenta...
						cant_veces++; 
				}
			}
		}
		return cant_veces;
	}
	
	@Override
	public boolean equals(Object obj) {
		PrestacionesPorPeriodoConHistorial o = (PrestacionesPorPeriodoConHistorial)obj;
		if ((o.getPrestacion().compareTo(this.prestacion)==0) && (o.getPeriodo() == this.periodo))
			return true;
		else return false;
	}

}
