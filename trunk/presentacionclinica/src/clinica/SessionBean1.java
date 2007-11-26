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
     * <p>Construir una instancia de bean de datos de la sesión.</p>
     */
    public SessionBean1() {
        servicioClinica = new ServiciosAplicacionClinicaMedico();
        servicioClinica.getMedicos();
    }

    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    

    /** 
     * <p>Se llama a este método al agregar este bean al
     * ámbito de la sesión.  Normalmente, esto ocurre como resultado de la evaluación
     * de una expresión de enlace de valores o de métodos, que utiliza la
     * función de bean administrado para crear una instancia de este bean y almacenarla en el
     * ámbito de la sesión.</p>
     * 
     * <p>Puede personalizar este método para inicializar y almacenar en caché los valores
     * o recursos necesarios para el ciclo de duración de una
     * sesión de usuario en particular.</p>
     */
    public void init() {
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar inicio de aplicación que debe finalizar
        // *antes* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

        // <editor-fold defaultstate="collapsed" desc="Inicio de componente administrado por el programa">
        // Iniciar componentes administrados automáticamente
        // *Nota* - esta lógica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicación que debe finalizar
        // *después* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

    }

    /** 
     * <p>Se llama a este método cuando la sesión que lo contiene está apunto de
     * configurarse en modo pasivo.  Normalmente, esto ocurre en un contenedor de servlet distribuido
     * cuando la sesión está apunto de transferirse a otra
     * instancia de contenedor, después de la cual se llamará al método <code>activate()</code>
     * para indicar que la transferencia se ha completado.</p>
     * 
     * <p>Puede personalizar este método para liberar las referencias a datos
     * o recursos de sesión que no pueden serializarse con la propia sesión.</p>
     */
    public void passivate() {
    }

    /** 
     * <p>Se llama a este método cuando la sesión que lo contiene se
     * reactiva.</p>
     * 
     * <p>Puede personalizar este método para volver a adquirir las referencias a
     * datos o recursos de la sesión que no pudieron serializarse con la
     * propia sesión.</p>
     */
    public void activate() {
    }

    /** 
     * <p>Se llama a este método al eliminar este bean del
     * ámbito de la sesión.  Normalmente, esto ocurre cuando
     * se supera el tiempo de espera de la sesión o la aplicación la finaliza.</p>
     * 
     * <p>Puede personalizar este método para limpiar los recursos asignados
     * durante la ejecución del método <code>init()</code> o
     * más adelante durante el ciclo de vida de la aplicación.</p>
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
