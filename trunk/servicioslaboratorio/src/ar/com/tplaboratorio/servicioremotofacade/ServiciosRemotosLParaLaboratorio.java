package ar.com.tplaboratorio.servicioremotofacade;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio;
import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator;
import DTORespuestaOrden.ResultadoOrdenMedicaDTO;
import ar.com.tplaboratorio.negocio.OrdenMedicaLab;

class ServiciosRemotosLParaLaboratorio implements IServiciosRemotosLParaLaboratorio {

	public void enviarResultadoOrdenMedica(OrdenMedicaLab ordenMedicaLab) {
		ResultadoOrdenAssembler resultadoAssembler=new ResultadoOrdenAssembler();
		
		ResultadoOrdenMedicaDTO resultadoOrdenDTO=resultadoAssembler.desensamblar(ordenMedicaLab);
		
		ServiciosRemotosCParaLaboratorioServiceLocator locator=new ServiciosRemotosCParaLaboratorioServiceLocator();
		try {
			ServiciosRemotosCParaLaboratorio service=locator.getServiciosRemotosCParaLaboratorio();
			service.recibirResultadoOrdenMedica(resultadoOrdenDTO);
		
		}
		catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RemoteFacadeException(e);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RemoteFacadeException(e);
		}
		
	}


}
