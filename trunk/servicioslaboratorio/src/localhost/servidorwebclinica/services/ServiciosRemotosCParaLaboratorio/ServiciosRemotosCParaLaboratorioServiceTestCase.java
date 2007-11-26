/**
 * ServiciosRemotosCParaLaboratorioServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio;

public class ServiciosRemotosCParaLaboratorioServiceTestCase extends junit.framework.TestCase {
    public ServiciosRemotosCParaLaboratorioServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testServiciosRemotosCParaLaboratorioWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator().getServiciosRemotosCParaLaboratorioAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ServiciosRemotosCParaLaboratorioRecibirResultadoOrdenMedica() throws Exception {
        localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub binding;
        try {
            binding = (localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub)
                          new localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioServiceLocator().getServiciosRemotosCParaLaboratorio();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.recibirResultadoOrdenMedica(new DTORespuestaOrden.ResultadoOrdenMedicaDTO());
        // TBD - validate results
    }

}
