package ar.com.tpclinica.negocio.reglas;

import java.util.Calendar;
import java.util.Date;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.OrdenMedicaItem;
import ar.com.tpclinica.negocio.Paciente;
import ar.com.tpclinica.negocio.Prestacion;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PrestacionesPorPeriodoConHistorialJUnitTC extends TestCase {

	
	public void testGetValor() throws Exception {
		Calendar calendar = Calendar.getInstance();

		Paciente paciente = new Paciente();
		paciente.setNombre("Seba");
		paciente.setId(1);

		Prestacion p1 = new Prestacion("kines", "kinesiología");
		p1.setId(1);

		Prestacion p2 = new Prestacion("opt", "óptica");
		p2.setId(2);

		Prestacion p3 = new Prestacion("rad", "radiología");
		p3.setId(3);
		
		Prestacion p4 = new Prestacion("odon", "odontología");
		p4.setId(4);

		Prestacion p5 = new Prestacion("clin", "clínico");
		p5.setId(5);

		OrdenMedicaItem omi1 = new OrdenMedicaItem();
		omi1.setDescripcion("omi1");
		omi1.setPrestacion(p1);
		
		OrdenMedicaItem omi2 = new OrdenMedicaItem();
		omi2.setDescripcion("omi2");
		omi2.setPrestacion(p2);
		
		OrdenMedicaItem omi3 = new OrdenMedicaItem();
		omi3.setDescripcion("omi3");
		omi3.setPrestacion(p3);
		
		OrdenMedicaItem omi4 = new OrdenMedicaItem();
		omi4.setDescripcion("omi4");
		omi4.setPrestacion(p4);
		
		OrdenMedicaItem omi5 = new OrdenMedicaItem();
		omi5.setDescripcion("omi5");
		omi5.setPrestacion(p5);

		
		OrdenMedica om1 = new OrdenMedica();
		om1.setPaciente(paciente);
		om1.agregarItem(omi1);
		om1.agregarItem(omi2);
		om1.agregarItem(omi3);
		calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - 10);
		om1.setFechaOrden(new Date(calendar.getTimeInMillis()));

		OrdenMedica om2 = new OrdenMedica();
		om2.setPaciente(paciente);
		om2.agregarItem(omi5);
		om2.agregarItem(omi4);
		om2.agregarItem(omi3);
		calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH) - 1);
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - 10);
		om2.setFechaOrden(new Date(calendar.getTimeInMillis()));

		OrdenMedica om3 = new OrdenMedica();
		om3.setPaciente(paciente);
		om3.agregarItem(omi1);
		om3.agregarItem(omi3);
		om3.agregarItem(omi5);
		calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH) - 1);
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - 20);
		om3.setFechaOrden(new Date(calendar.getTimeInMillis()));

		
		PrestacionesPorPeriodoConHistorial pppch1 = new PrestacionesPorPeriodoConHistorial(p3.getDescripcion(), 45);
		Assert.assertEquals(pppch1.getValor(om1), 2); // en om1 y en om2

		PrestacionesPorPeriodoConHistorial pppch2 = new PrestacionesPorPeriodoConHistorial(p3.getDescripcion(), 20);
		Assert.assertEquals(pppch2.getValor(om1), 1); // solo en om1
		
		PrestacionesPorPeriodoConHistorial pppch3 = new PrestacionesPorPeriodoConHistorial(p1.getDescripcion(), 5);
		Assert.assertEquals(pppch3.getValor(om1), 0);

		PrestacionesPorPeriodoConHistorial pppch4 = new PrestacionesPorPeriodoConHistorial(p3.getDescripcion(), 135);
		Assert.assertEquals(pppch4.getValor(om1), 3); // en las 3

		PrestacionesPorPeriodoConHistorial pppch5 = new PrestacionesPorPeriodoConHistorial(p3.getDescripcion(), 5);
		Assert.assertEquals(pppch3.getValor(om2), 0); // en ninguna
	}
}
