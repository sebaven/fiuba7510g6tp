package ar.com.tpclinica.negocio.reglas;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;
import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.Paciente;

public class MesesEnPlanJUnitTC extends TestCase {

	public void testGetValor() throws Exception {
		Paciente paciente = new Paciente();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2007);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		Date date = new Date(calendar.getTimeInMillis());
		paciente.setFechaInicioPlan(date);
		
		OrdenMedica medica = new OrdenMedica();
		medica.setPaciente(paciente);
		MesesEnPlan plan = new MesesEnPlan();
		Assert.assertEquals(plan.getValor(medica), 7);
	}
}
