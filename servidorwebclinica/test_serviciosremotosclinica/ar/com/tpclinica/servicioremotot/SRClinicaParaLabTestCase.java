package ar.com.tpclinica.servicioremotot;

import java.rmi.RemoteException;

import javax.xml.rpc.Service;

import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio;
import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator;

public class SRClinicaParaLabTestCase extends WebServiceTestCase{

	private ServiciosRemotosCParaLaboratorio serviciosRemotos;
	@Override
	protected String getServiceInterfaceName() {
		return "getServiciosRemotosCParaLaboratorio";
	}

	@Override
	protected Service getServiceLocator() {
		return new ServiciosRemotosCParaLaboratorioServiceLocator();
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.serviciosRemotos=(ServiciosRemotosCParaLaboratorio)this.iWebService;
		
	}

	
	public void testInvocation() throws RemoteException{
		this.serviciosRemotos.recibirResultadoOrdenMedica(null);
	}
}
