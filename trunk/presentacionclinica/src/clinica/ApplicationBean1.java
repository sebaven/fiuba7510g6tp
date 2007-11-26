/*
 * ApplicationBean1.java
 *
 * Created on 23 de noviembre de 2007, 02:11
 * Copyright seba
 */
package clinica;

import com.sun.rave.web.ui.appbase.AbstractApplicationBean;
import javax.faces.FacesException;

/**
 * <p>Application scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available to all users
 *  and pages in the application.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class ApplicationBean1 extends AbstractApplicationBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de datos de la aplicaci�n.</p>
     */
    public ApplicationBean1() {
    }

    /** 
     * <p>Se llama a este m�todo al agregar este bean al
     * �mbito de la aplicaci�n.  Normalmente, esto ocurre como resultado de la evaluaci�n
     * de una expresi�n de enlace de valores o de m�todos, que utiliza la
     * funci�n de bean administrado para crear una instancia de este bean y almacenarla en el
     * �mbito de la aplicaci�n.</p>
     * 
     * <p>Puede personalizar este m�todo para iniciar y almacenar en cach� valores
     * de datos generales de la aplicaci�n (como las listas de opciones v�lidas para componentes de listas desplegables),
     * o para asignar recursos necesarios durante el
     * ciclo de duraci�n de la aplicaci�n.</p>
     */
    public void init() {
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar inicio de aplicaci�n que debe finalizar
        // *antes* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Iniciar componentes administrados autom�ticamente
        // *Nota* - esta l�gica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("ApplicationBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicaci�n que debe finalizar
        // *despu�s* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

    }

    /** 
     * <p>Se llama a este m�todo al eliminar este bean del
     * �mbito de la aplicaci�n.  Normalmente, esto ocurre cuando
     * el propio contenedor de la aplicaci�n la cierra.</p>
     * 
     * <p>Puede personalizar este m�todo para limpiar los recursos asignados
     * durante la ejecuci�n del m�todo <code>init()</code> o
     * m�s adelante durante el ciclo de vida de la aplicaci�n.</p>
     */
    public void destroy() {
    }
    
    
    /**
     * <p>Return an appropriate character encoding based on the
     * <code>Locale</code> defined for the current JavaServer Faces
     * view.  If no more suitable encoding can be found, return
     * "UTF-8" as a general purpose default.</p>
     *
     * <p>The default implementation uses the implementation from
     * our superclass, <code>AbstractApplicationBean</code>.</p>
     */
    public String getLocaleCharacterEncoding() {
        return super.getLocaleCharacterEncoding();
    }
    
    
}
