package ar.com.tpclinica.serviciosimp;

import java.util.Collection;

import ar.com.tpclinica.negocio.OrdenMedica;
import ar.com.tpclinica.servicios.interfaces.ISerrvicioRemotoOrdenMedica;

/**
 * Todos los servicios remotos que la clinica desee usar tienen una implementación, que esta utilizando
 * un servicio proporcionado por un sistema diferente.
 * Aca se hace la delegacion en ese sistema diferente (la llamada al servicio remoto) y la transformacion
 * del modelo IOrdenMedica a un modelo que el servicio remoto sepa intender.
 * @author carlos
 *
 */
class ServiciosRemotosCParaClinica implements ISerrvicioRemotoOrdenMedica{

	/**
	 * Aca va el servico remoto al que se llama en serio
	 */
	private Object serviciosRemotoPosta;
	public void enviarOrdenLaboratorio(OrdenMedica ordenMedica,
			String codigoLaboratorio) {

		
		
	}

	public void enviarOrdenLaboratorio(Collection<OrdenMedica> ordenesMedicas,
			String codigoLaboratorio) {

		
		
	}

}
