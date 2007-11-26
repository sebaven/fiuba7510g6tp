package ar.com.tplaboratorio.servicios;

import junit.framework.TestCase;
import ar.com.tplaboratorio.servicios.orden.dto.ItemOrdenMedicaDTO;
import ar.com.tplaboratorio.servicios.orden.dto.OrdeneMedicaDTO;

public class ServiciosRemotosLParaClinicaTestCase extends TestCase {

	public void testInvocacionLocal(){
		ServiciosRemotosLParaClinica servicio=new ServiciosRemotosLParaClinica();
		servicio.recibirOrdenesMedicas(this.createOrdenMedicaDTOLocal());
	}

	
	private OrdeneMedicaDTO[] createOrdenMedicaDTOLocal() {
		
		OrdeneMedicaDTO[] ordenesDTO=new OrdeneMedicaDTO[1];
		
		OrdeneMedicaDTO ordenDTO=new OrdeneMedicaDTO();
		ordenDTO.setDiagnostico("es gay");
		ordenDTO.setMedico("nadie");
		ordenDTO.setNroOrden(1);
		ordenDTO.setPaciente("fabian");
		ItemOrdenMedicaDTO itemDTO=new ItemOrdenMedicaDTO();
		itemDTO.setCodigoPrestacion(1);
		itemDTO.setDescripcion("nada");
		itemDTO.setDescripcionPrestacion("alguna");
		ItemOrdenMedicaDTO[] itemsDTO=new ItemOrdenMedicaDTO[1];
		itemsDTO[0]=itemDTO;
		ordenDTO.setItems(itemsDTO);
		                              
		ordenesDTO[0]=ordenDTO;
		
		return ordenesDTO;
	}
}
