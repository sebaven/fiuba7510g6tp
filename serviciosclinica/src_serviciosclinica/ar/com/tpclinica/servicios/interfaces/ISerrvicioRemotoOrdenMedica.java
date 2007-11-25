package ar.com.tpclinica.servicios.interfaces;

import java.util.Collection;


public interface ISerrvicioRemotoOrdenMedica {

	public void enviarOrdenLaboratorio(IOrdenMedica ordenMedica,String codigoLaboratorio);
	public void enviarOrdenLaboratorio(Collection<IOrdenMedica> ordenesMedicas,String codigoLaboratorio);

	
}
