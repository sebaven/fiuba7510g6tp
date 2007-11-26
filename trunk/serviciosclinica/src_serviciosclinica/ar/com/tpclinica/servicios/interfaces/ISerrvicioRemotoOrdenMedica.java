package ar.com.tpclinica.servicios.interfaces;

import java.util.Collection;

import ar.com.tpclinica.negocio.OrdenMedica;


public interface ISerrvicioRemotoOrdenMedica {

	public void enviarOrdenLaboratorio(OrdenMedica ordenMedica,String codigoLaboratorio);
	public void enviarOrdenLaboratorio(Collection<OrdenMedica> ordenesMedicas,String codigoLaboratorio);

	
}
