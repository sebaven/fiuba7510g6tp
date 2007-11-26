package ar.com.tplaboratorio.servicioremoto;

import java.lang.reflect.Method;
import java.rmi.Remote;

import javax.xml.rpc.Service;

import junit.framework.TestCase;

public abstract class WebServiceTestCase extends TestCase {

    /**
     * Rerefence to an interface for a web service
     */
    protected Remote iWebService;
    
    @Override
    protected void setUp() throws Exception {
        Service locator;
        
        locator = this.getServiceLocator();
        Method m=locator.getClass().getMethod(this.getServiceInterfaceName(), null);
        iWebService = (Remote) m.invoke(locator,null);
        
    }

    
    /**
     * Template method to provide the name of the interface to the web service.
     * 
     * @return {@link Remote}
     */
    protected abstract String getServiceInterfaceName();

    /**
     * Template method to provide the SeviceLocator. A ServiceLocator is an
     * interface with methods to find the real service
     * 
     * @return {@link Service}
     */
    protected abstract Service getServiceLocator();

}
