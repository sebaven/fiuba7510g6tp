/*
 * DetallesDePaciente.java
 *
 * Created on 23 de noviembre de 2007, 02:37
 * Copyright seba
 */
package clinica.OrdenMedica;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.sun.rave.web.ui.component.Button;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class DetallesDePaciente extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }

    private StaticText lblTitulo = new StaticText();

    public StaticText getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(StaticText st) {
        this.lblTitulo = st;
    }

    private StaticText lblNombre = new StaticText();

    public StaticText getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(StaticText st) {
        this.lblNombre = st;
    }

    private StaticText lblApellido = new StaticText();

    public StaticText getLblApellido() {
        return lblApellido;
    }

    public void setLblApellido(StaticText st) {
        this.lblApellido = st;
    }

    private StaticText lblDNI = new StaticText();

    public StaticText getLblDNI() {
        return lblDNI;
    }

    public void setLblDNI(StaticText st) {
        this.lblDNI = st;
    }

    private StaticText lblPlan = new StaticText();

    public StaticText getLblPlan() {
        return lblPlan;
    }

    public void setLblPlan(StaticText st) {
        this.lblPlan = st;
    }

    private StaticText lblDireccion = new StaticText();

    public StaticText getLblDireccion() {
        return lblDireccion;
    }

    public void setLblDireccion(StaticText st) {
        this.lblDireccion = st;
    }

    private StaticText lblTelefono = new StaticText();

    public StaticText getLblTelefono() {
        return lblTelefono;
    }

    public void setLblTelefono(StaticText st) {
        this.lblTelefono = st;
    }

    private StaticText lblLocalidad = new StaticText();

    public StaticText getLblLocalidad() {
        return lblLocalidad;
    }

    public void setLblLocalidad(StaticText st) {
        this.lblLocalidad = st;
    }

    private StaticText lblEmail = new StaticText();

    public StaticText getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(StaticText st) {
        this.lblEmail = st;
    }

    private TextField txbNombre = new TextField();

    public TextField getTxbNombre() {
        return txbNombre;
    }

    public void setTxbNombre(TextField tf) {
        this.txbNombre = tf;
    }

    private TextField txbApellido = new TextField();

    public TextField getTxbApellido() {
        return txbApellido;
    }

    public void setTxbApellido(TextField tf) {
        this.txbApellido = tf;
    }

    private TextField txbDNI = new TextField();

    public TextField getTxbDNI() {
        return txbDNI;
    }

    public void setTxbDNI(TextField tf) {
        this.txbDNI = tf;
    }

    private TextField txbPlan = new TextField();

    public TextField getTxbPlan() {
        return txbPlan;
    }

    public void setTxbPlan(TextField tf) {
        this.txbPlan = tf;
    }

    private TextField txbDireccion = new TextField();

    public TextField getTxbDireccion() {
        return txbDireccion;
    }

    public void setTxbDireccion(TextField tf) {
        this.txbDireccion = tf;
    }

    private TextField txbLocalidad = new TextField();

    public TextField getTxbLocalidad() {
        return txbLocalidad;
    }

    public void setTxbLocalidad(TextField tf) {
        this.txbLocalidad = tf;
    }

    private TextField txbTelefono = new TextField();

    public TextField getTxbTelefono() {
        return txbTelefono;
    }

    public void setTxbTelefono(TextField tf) {
        this.txbTelefono = tf;
    }

    private TextField txbEmail = new TextField();

    public TextField getTxbEmail() {
        return txbEmail;
    }

    public void setTxbEmail(TextField tf) {
        this.txbEmail = tf;
    }

    private StaticText lblHistorial = new StaticText();

    public StaticText getLblHistorial() {
        return lblHistorial;
    }

    public void setLblHistorial(StaticText st) {
        this.lblHistorial = st;
    }

    private Listbox lbxHistorial = new Listbox();

    public Listbox getLbxHistorial() {
        return lbxHistorial;
    }

    public void setLbxHistorial(Listbox l) {
        this.lbxHistorial = l;
    }

    private DefaultOptionsList lbxHistorialDefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxHistorialDefaultOptions() {
        return lbxHistorialDefaultOptions;
    }

    public void setLbxHistorialDefaultOptions(DefaultOptionsList dol) {
        this.lbxHistorialDefaultOptions = dol;
    }

    private Button btnObtenerHistorial = new Button();

    public Button getBtnObtenerHistorial() {
        return btnObtenerHistorial;
    }

    public void setBtnObtenerHistorial(Button b) {
        this.btnObtenerHistorial = b;
    }

    private Button btnAceptar = new Button();

    public Button getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(Button b) {
        this.btnAceptar = b;
    }
    
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de p�gina.</p>
     */
    public DetallesDePaciente() {
    }

    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected clinica.SessionBean1 getSessionBean1() {
        return (clinica.SessionBean1)getBean("SessionBean1");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected clinica.RequestBean1 getRequestBean1() {
        return (clinica.RequestBean1)getBean("RequestBean1");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con �mbito.</p>
     */
    protected clinica.ApplicationBean1 getApplicationBean1() {
        return (clinica.ApplicationBean1)getBean("ApplicationBean1");
    }


    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se navega hasta esta p�gina,
     * ya sea directamente mediante un URL o de manera indirecta a trav�s de la navegaci�n de p�ginas.
     * Puede personalizar este m�todo para adquirir recursos que se necesitar�n
     * para los controladores de eventos y m�todos del proceso, sin tener en cuenta si esta
     * p�gina realiza procesamiento de devoluci�n de env�os.</p>
     * 
     * <p>Tenga en cuenta que si la petici�n actual es una devoluci�n de env�o, los valores
     * de propiedad de los componentes <strong>no</strong> representan ning�n
     * valor enviado con esta petici�n.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se proces�.</p>
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
            log("DetallesDePaciente Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicaci�n que debe finalizar
        // *despu�s* de que se inicien los componentes administrados
        // TODO - Agregar c�digo de inicio propio aqu�

    }

    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama cuando el �rbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este m�todo
     * <strong>s�lo</strong> se llamar� en una petici�n de devoluci�n de env�o que
     * est� procesando el env�o de un formulario.  Puede personalizar este m�todo para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    public void preprocess() {
    }

    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama justo antes del procesamiento.
     * <strong>S�lo</strong> se llamar� a este m�todo en la p�gina que
     * se procesa, no se llamar�, por ejemplo, en una p�gina que
     * ha procesado una devoluci�n de env�o y a continuaci�n ha navegado hasta otra p�gina.  Puede personalizar
     * este m�todo para asignar recursos necesarios para procesar
     * esta p�gina.</p>
     */
    public void prerender() {
    }

    /** 
     * <p>M�todo de devoluci�n de llamada al que se llama cuando se completa el procesamiento de
     * esta petici�n, si se llam� al m�todo <code>init()</code> (sin tener en cuenta
     * si se trata de la p�gina que se ha procesado o no).  Puede personalizar este
     * m�todo para liberar los recursos adquiridos en los m�todos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecuci�n de un controlador de eventos).</p>
     */
    public void destroy() {
    }
}

