package ar.com.tpclinica.servicioremotot;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.Service;

import DTORespuestaOrden.ResultadoItemDTO;
import DTORespuestaOrden.ResultadoOrdenMedicaDTO;

import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio;
import localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator;

/**
 * Test case para los servicios que expone esta la aplicaicion web que utiliza este componente
 * @author carlos
 *
 */
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

	/**
	 * Testeamos que funcione remotamente
	 * @throws RemoteException
	 */
	public void testInvocation() throws RemoteException{
		ResultadoOrdenMedicaDTO resultado=this.createResultadoOrden();
		this.serviciosRemotos.recibirResultadoOrdenMedica(resultado);
	}
	
	/**
	 * Testeamos que funcione localmente
	 */
	public void testLocalInvocation(){
		ar.com.tpclinica.servicioremoto.ServiciosRemotosCParaLaboratorio service=new ar.com.tpclinica.servicioremoto.ServiciosRemotosCParaLaboratorio();
		service.recibirResultadoOrdenMedica(this.createResultadoOrdenLocal());
		
	}

	private ResultadoOrdenMedicaDTO createResultadoOrden() {
		ResultadoOrdenMedicaDTO resultado=new ResultadoOrdenMedicaDTO();
		resultado.setLegajoTecnico(33);
		resultado.setNroOrden(800001);
		resultado.setResultadoItem(this.createResultadosItems());
		
		return resultado;
	}

	

	private ResultadoItemDTO[] createResultadosItems() {
		ResultadoItemDTO[] resultadoItemDTOs =new ResultadoItemDTO[1];
		
		 ResultadoItemDTO resultadoItemDTO=new ResultadoItemDTO();
		resultadoItemDTO.setCodigoPrestacion("343");
		resultadoItemDTO.setDescripcion("nada");
		resultadoItemDTO.setFecha(Calendar.getInstance());
		resultadoItemDTO.setTipo(2);
		resultadoItemDTOs[0]=resultadoItemDTO;
		return resultadoItemDTOs;
	}

	private ar.com.tpclinica.servicioremoto.orden.ResultadoOrdenMedicaDTO createResultadoOrdenLocal() {
		ar.com.tpclinica.servicioremoto.orden.ResultadoOrdenMedicaDTO resultado=new ar.com.tpclinica.servicioremoto.orden.ResultadoOrdenMedicaDTO();
		resultado.setLegajoTecnico(33);
		resultado.setNroOrden(800001);
		resultado.setResultadoItem(this.createResultadosItemsLocal());
		
		return resultado;
	}

	private ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO[] createResultadosItemsLocal() {
		ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO[] resultadoItemDTOs =new ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO[1];
		
		 ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO resultadoItemDTO=new ar.com.tpclinica.servicioremoto.orden.ResultadoItemDTO();
		resultadoItemDTO.setCodigoPrestacion("343");
		resultadoItemDTO.setDescripcion("nada");
		resultadoItemDTO.setFecha(new Date());
		resultadoItemDTO.setTipo(2);
		resultadoItemDTOs[0]=resultadoItemDTO;
		return resultadoItemDTOs;

	}
}
