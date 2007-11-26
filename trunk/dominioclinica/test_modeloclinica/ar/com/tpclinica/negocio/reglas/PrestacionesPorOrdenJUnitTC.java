package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.negocio.OrdenMedicaItem;
import ar.com.tpclinica.negocio.Prestacion;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PrestacionesPorOrdenJUnitTC extends TestCase {

	
	public void testGetValor() throws Exception {
		Prestacion prestacion = new Prestacion("yeah");
		Prestacion prestacion2 = new Prestacion("yeah");
		Prestacion prestacion3 = new Prestacion("yeah");
		Prestacion prestacion4 = new Prestacion("yeah");
		Prestacion prestacion5 = new Prestacion("gf");
		
		OrdenMedica medica = new OrdenMedica();
		
		medica.agregarItem(new OrdenMedicaItem(prestacion));
		medica.agregarItem(new OrdenMedicaItem(prestacion2));
		medica.agregarItem(new OrdenMedicaItem(prestacion3));
		medica.agregarItem(new OrdenMedicaItem(prestacion4));
		medica.agregarItem(new OrdenMedicaItem(prestacion5));
		
		PrestacionesPorOrden prestacionesPorOrden = new PrestacionesPorOrden("gf");
		
		Assert.assertEquals(prestacionesPorOrden.getValor(medica), 1);
	}
}
