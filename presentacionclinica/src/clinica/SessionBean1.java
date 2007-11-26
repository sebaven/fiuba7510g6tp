/*
 * SessionBean1.java
 *
 * Created on 23 de noviembre de 2007, 02:11
 * Copyright seba
 */
package clinica;
import ar.com.tpclinica.serviciosaplicacion.ServiciosAplicacionClinicaMedico;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.sun.rave.web.ui.model.Option;
import javax.faces.FacesException;


/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class SessionBean1 extends AbstractSessionBean {
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
     * <p>Construir una instancia de bean de datos de la sesi�n.</p>
     */
    public SessionBean1() {
        servicioClinica = new ServiciosAplicacionClinicaMedico();
        servicioClinica.getMedicos();
    }

    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    

    /** 
     * <p>Se llama a este m�todo al agregar este bean al
     * �mbito de la sesi�n.  Normalmente, esto ocurre como resultado de la evaluaci�n
     * de una expresi�n de enlace de valores o de m�todos, que utiliza la
     * funci�n de bean administrado para crear una instancia de este bean y almacenarla en el
     * �mbito de la sesi�n.</p>
     * 
     * <p>Puede personalizar este m�todo para inicializar y almacenar en cach� los valores
     * o recursos necesarios para el ciclo de duraci�n de una
     * sesi�n de usuario en particular.</p>
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
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicaci�n que debe finalizar
        // *despu�s* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

    }

    /** 
     * <p>Se llama a este m�todo cuando la sesi�n que lo contiene est� apunto de
     * configurarse en modo pasivo.  Normalmente, esto ocurre en un contenedor de servlet distribuido
     * cuando la sesi�n est� apunto de transferirse a otra
     * instancia de contenedor, despu�s de la cual se llamar� al m�todo <code>activate()</code>
     * para indicar que la transferencia se ha completado.</p>
     * 
     * <p>Puede personalizar este m�todo para liberar las referencias a datos
     * o recursos de sesi�n que no pueden serializarse con la propia sesi�n.</p>
     */
    public void passivate() {
    }

    /** 
     * <p>Se llama a este m�todo cuando la sesi�n que lo contiene se
     * reactiva.</p>
     * 
     * <p>Puede personalizar este m�todo para volver a adquirir las referencias a
     * datos o recursos de la sesi�n que no pudieron serializarse con la
     * propia sesi�n.</p>
     */
    public void activate() {
    }

    /** 
     * <p>Se llama a este m�todo al eliminar este bean del
     * �mbito de la sesi�n.  Normalmente, esto ocurre cuando
     * se supera el tiempo de espera de la sesi�n o la aplicaci�n la finaliza.</p>
     * 
     * <p>Puede personalizar este m�todo para limpiar los recursos asignados
     * durante la ejecuci�n del m�todo <code>init()</code> o
     * m�s adelante durante el ciclo de vida de la aplicaci�n.</p>
     */
    public void destroy() {
    }

    /**
     * Conserva el valor de la propiedad servicioClinica.
     */
    private ServiciosAplicacionClinicaMedico servicioClinica;

    /**
     * Getter para propiedad servicioClinica.
     * @return Valor de la propiedad servicioClinica.
     */
    public ServiciosAplicacionClinicaMedico getServicioClinica() {

        return this.servicioClinica;
    }

    /**
     * Setter para propiedad servicioClinica.
     * @param servicioClinica Nuevo valor de la propiedad servicioClinica.
     */
    public void setServicioClinica(ServiciosAplicacionClinicaMedico servicioClinica) {

        this.servicioClinica = servicioClinica;
    }

    /**
     * Conserva el valor de la propiedad medicos.
     */
    private Option[] medicos;

    /**
     * Getter para propiedad medicos.
     * @return Valor de la propiedad medicos.
     */
    public Option[] getMedicos() {

        return this.medicos;
    }

    /**
     * Setter para propiedad medicos.
     * @param medicos Nuevo valor de la propiedad medicos.
     */
    public void setMedicos(Option[] medicos) {
        this.medicos = medicos;
    }

}
