/**
 * ServiciosRemotosLParaClinicaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica;

public class ServiciosRemotosLParaClinicaServiceLocator extends org.apache.axis.client.Service implements localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaService {

    public ServiciosRemotosLParaClinicaServiceLocator() {
    }


    public ServiciosRemotosLParaClinicaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiciosRemotosLParaClinicaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiciosRemotosLParaClinica
    private java.lang.String ServiciosRemotosLParaClinica_address = "http://localhost:8080/servidorwelaboratorio/services/ServiciosRemotosLParaClinica";

    public java.lang.String getServiciosRemotosLParaClinicaAddress() {
        return ServiciosRemotosLParaClinica_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiciosRemotosLParaClinicaWSDDServiceName = "ServiciosRemotosLParaClinica";

    public java.lang.String getServiciosRemotosLParaClinicaWSDDServiceName() {
        return ServiciosRemotosLParaClinicaWSDDServiceName;
    }

    public void setServiciosRemotosLParaClinicaWSDDServiceName(java.lang.String name) {
        ServiciosRemotosLParaClinicaWSDDServiceName = name;
    }

    public localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinica getServiciosRemotosLParaClinica() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiciosRemotosLParaClinica_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiciosRemotosLParaClinica(endpoint);
    }

    public localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinica getServiciosRemotosLParaClinica(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaSoapBindingStub _stub = new localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiciosRemotosLParaClinicaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiciosRemotosLParaClinicaEndpointAddress(java.lang.String address) {
        ServiciosRemotosLParaClinica_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinica.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaSoapBindingStub _stub = new localhost.servidorwelaboratorio.services.ServiciosRemotosLParaClinica.ServiciosRemotosLParaClinicaSoapBindingStub(new java.net.URL(ServiciosRemotosLParaClinica_address), this);
                _stub.setPortName(getServiciosRemotosLParaClinicaWSDDServiceName());
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
        if ("ServiciosRemotosLParaClinica".equals(inputPortName)) {
            return getServiciosRemotosLParaClinica();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/servidorwelaboratorio/services/ServiciosRemotosLParaClinica", "ServiciosRemotosLParaClinicaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/servidorwelaboratorio/services/ServiciosRemotosLParaClinica", "ServiciosRemotosLParaClinica"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiciosRemotosLParaClinica".equals(portName)) {
            setServiciosRemotosLParaClinicaEndpointAddress(address);
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
