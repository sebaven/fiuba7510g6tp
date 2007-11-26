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
	}
	
	public int getValor(OrdenMedica om)
	{
		// en ese tiempo, cuántas veces aparece la prestac. en el historial
        Calendar lTemp = new GregorianCalendar();
        lTemp.setTime( new Date() );
        lTemp.add( lTemp.DAY_OF_MONTH, -1 * this.periodo);
        Date fechaInicial = new Date(lTemp.getTimeInMillis());
		int cant_veces = 0;

		for (OrdenMedica omActual : om.getPaciente().getOrdenesMedicas()) {
			if (om.getFechaOrden().after(fechaInicial)) { // se tiene en cuenta a la orden
				for (ar.com.tpclinica.negocio.OrdenMedicaItem omi : omActual.getItems()) { // se itera sobre los items
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
