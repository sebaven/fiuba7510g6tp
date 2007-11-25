package ar.com.tpclinica.servicioremotot;

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

	public void testCast(){
		this.serviciosRemotos=(ServiciosRemotosCParaLaboratorio)this.iWebService;
	}
}
