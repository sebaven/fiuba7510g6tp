/**
 * ServiciosRemotosCParaLaboratorioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio;

public class ServiciosRemotosCParaLaboratorioServiceLocator extends org.apache.axis.client.Service implements localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioService {

    public ServiciosRemotosCParaLaboratorioServiceLocator() {
    }


    public ServiciosRemotosCParaLaboratorioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiciosRemotosCParaLaboratorioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiciosRemotosCParaLaboratorio
    private java.lang.String ServiciosRemotosCParaLaboratorio_address = "http://localhost:8080/servidorwebclinica/services/ServiciosRemotosCParaLaboratorio";

    public java.lang.String getServiciosRemotosCParaLaboratorioAddress() {
        return ServiciosRemotosCParaLaboratorio_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiciosRemotosCParaLaboratorioWSDDServiceName = "ServiciosRemotosCParaLaboratorio";

    public java.lang.String getServiciosRemotosCParaLaboratorioWSDDServiceName() {
        return ServiciosRemotosCParaLaboratorioWSDDServiceName;
    }

    public void setServiciosRemotosCParaLaboratorioWSDDServiceName(java.lang.String name) {
        ServiciosRemotosCParaLaboratorioWSDDServiceName = name;
    }

    public localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio getServiciosRemotosCParaLaboratorio() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiciosRemotosCParaLaboratorio_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiciosRemotosCParaLaboratorio(endpoint);
    }

    public localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio getServiciosRemotosCParaLaboratorio(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub _stub = new localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiciosRemotosCParaLaboratorioWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiciosRemotosCParaLaboratorioEndpointAddress(java.lang.String address) {
        ServiciosRemotosCParaLaboratorio_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorio.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub _stub = new localhost.servidorwebclinica.services.ServiciosRemotosCParaLaboratorio.ServiciosRemotosCParaLaboratorioSoapBindingStub(new java.net.URL(ServiciosRemotosCParaLaboratorio_address), this);
                _stub.setPortName(getServiciosRemotosCParaLaboratorioWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiciosRemotosCParaLaboratorio".equals(inputPortName)) {
            return getServiciosRemotosCParaLaboratorio();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/servidorwebclinica/services/ServiciosRemotosCParaLaboratorio", "ServiciosRemotosCParaLaboratorioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/servidorwebclinica/services/ServiciosRemotosCParaLaboratorio", "ServiciosRemotosCParaLaboratorio"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiciosRemotosCParaLaboratorio".equals(portName)) {
            setServiciosRemotosCParaLaboratorioEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
