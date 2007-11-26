/*
 * AñadirMedico.java
 *
 * Created on 25 de noviembre de 2007, 05:08
 * Copyright seba
 */
package clinica.Medicos;

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
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.model.DefaultOptionsList;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class AñadirMedico extends AbstractPageBean {
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

    private StaticText lblTitulo1 = new StaticText();

    public StaticText getLblTitulo1() {
        return lblTitulo1;
    }

    public void setLblTitulo1(StaticText st) {
        this.lblTitulo1 = st;
    }

    private TextField txbDNI1 = new TextField();

    public TextField getTxbDNI1() {
        return txbDNI1;
    }

    public void setTxbDNI1(TextField tf) {
        this.txbDNI1 = tf;
    }

    private StaticText lblHospital1 = new StaticText();

    public StaticText getLblHospital1() {
        return lblHospital1;
    }

    public void setLblHospital1(StaticText st) {
        this.lblHospital1 = st;
    }

    private StaticText lblCUIT1 = new StaticText();

    public StaticText getLblCUIT1() {
        return lblCUIT1;
    }

    public void setLblCUIT1(StaticText st) {
        this.lblCUIT1 = st;
    }

    private StaticText lblTelefono1 = new StaticText();

    public StaticText getLblTelefono1() {
        return lblTelefono1;
    }

    public void setLblTelefono1(StaticText st) {
        this.lblTelefono1 = st;
    }

    private TextField txbTelefono1 = new TextField();

    public TextField getTxbTelefono1() {
        return txbTelefono1;
    }

    public void setTxbTelefono1(TextField tf) {
        this.txbTelefono1 = tf;
    }

    private TextField txbApellido1 = new TextField();

    public TextField getTxbApellido1() {
        return txbApellido1;
    }

    public void setTxbApellido1(TextField tf) {
        this.txbApellido1 = tf;
    }

    private TextField txbNombre1 = new TextField();

    public TextField getTxbNombre1() {
        return txbNombre1;
    }

    public void setTxbNombre1(TextField tf) {
        this.txbNombre1 = tf;
    }

    private TextField txbLocalidad1 = new TextField();

    public TextField getTxbLocalidad1() {
        return txbLocalidad1;
    }

    public void setTxbLocalidad1(TextField tf) {
        this.txbLocalidad1 = tf;
    }

    private TextField txbDireccion1 = new TextField();

    public TextField getTxbDireccion1() {
        return txbDireccion1;
    }

    public void setTxbDireccion1(TextField tf) {
        this.txbDireccion1 = tf;
    }

    private TextField txbEmail1 = new TextField();

    public TextField getTxbEmail1() {
        return txbEmail1;
    }

    public void setTxbEmail1(TextField tf) {
        this.txbEmail1 = tf;
    }

    private Listbox lbxEspecialidades1 = new Listbox();

    public Listbox getLbxEspecialidades1() {
        return lbxEspecialidades1;
    }

    public void setLbxEspecialidades1(Listbox l) {
        this.lbxEspecialidades1 = l;
    }

    private StaticText lblEspecialidades1 = new StaticText();

    public StaticText getLblEspecialidades1() {
        return lblEspecialidades1;
    }

    public void setLblEspecialidades1(StaticText st) {
        this.lblEspecialidades1 = st;
    }

    private StaticText lblEmail1 = new StaticText();

    public StaticText getLblEmail1() {
        return lblEmail1;
    }

    public void setLblEmail1(StaticText st) {
        this.lblEmail1 = st;
    }

    private StaticText lblDatosPersonales1 = new StaticText();

    public StaticText getLblDatosPersonales1() {
        return lblDatosPersonales1;
    }

    public void setLblDatosPersonales1(StaticText st) {
        this.lblDatosPersonales1 = st;
    }

    private Button btnSubmit1 = new Button();

    public Button getBtnSubmit1() {
        return btnSubmit1;
    }

    public void setBtnSubmit1(Button b) {
        this.btnSubmit1 = b;
    }

    private StaticText lblApellido1 = new StaticText();

    public StaticText getLblApellido1() {
        return lblApellido1;
    }

    public void setLblApellido1(StaticText st) {
        this.lblApellido1 = st;
    }

    private StaticText lblDNI1 = new StaticText();

    public StaticText getLblDNI1() {
        return lblDNI1;
    }

    public void setLblDNI1(StaticText st) {
        this.lblDNI1 = st;
    }

    private StaticText lblDireccion1 = new StaticText();

    public StaticText getLblDireccion1() {
        return lblDireccion1;
    }

    public void setLblDireccion1(StaticText st) {
        this.lblDireccion1 = st;
    }

    private StaticText lblLocalidad1 = new StaticText();

    public StaticText getLblLocalidad1() {
        return lblLocalidad1;
    }

    public void setLblLocalidad1(StaticText st) {
        this.lblLocalidad1 = st;
    }

    private TextField txbCUIT1 = new TextField();

    public TextField getTxbCUIT1() {
        return txbCUIT1;
    }

    public void setTxbCUIT1(TextField tf) {
        this.txbCUIT1 = tf;
    }

    private StaticText lblDatosProfesionales1 = new StaticText();

    public StaticText getLblDatosProfesionales1() {
        return lblDatosProfesionales1;
    }

    public void setLblDatosProfesionales1(StaticText st) {
        this.lblDatosProfesionales1 = st;
    }

    private TextField txbHospital1 = new TextField();

    public TextField getTxbHospital1() {
        return txbHospital1;
    }

    public void setTxbHospital1(TextField tf) {
        this.txbHospital1 = tf;
    }

    private StaticText lblNombre1 = new StaticText();

    public StaticText getLblNombre1() {
        return lblNombre1;
    }

    public void setLblNombre1(StaticText st) {
        this.lblNombre1 = st;
    }

    private DefaultOptionsList lbxEspecialidades1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxEspecialidades1DefaultOptions() {
        return lbxEspecialidades1DefaultOptions;
    }

    public void setLbxEspecialidades1DefaultOptions(DefaultOptionsList dol) {
        this.lbxEspecialidades1DefaultOptions = dol;
    }
    
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de página.</p>
     */
    public AñadirMedico() {
    }

    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected clinica.ApplicationBean1 getApplicationBean1() {
        return (clinica.ApplicationBean1)getBean("ApplicationBean1");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected clinica.SessionBean1 getSessionBean1() {
        return (clinica.SessionBean1)getBean("SessionBean1");
    }


    /** 
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected clinica.RequestBean1 getRequestBean1() {
        return (clinica.RequestBean1)getBean("RequestBean1");
    }


    /** 
     * <p>Método de devolución de llamada al que se llama cuando se navega hasta esta página,
     * ya sea directamente mediante un URL o de manera indirecta a través de la navegación de páginas.
     * Puede personalizar este método para adquirir recursos que se necesitarán
     * para los controladores de eventos y métodos del proceso, sin tener en cuenta si esta
     * página realiza procesamiento de devolución de envíos.</p>
     * 
     * <p>Tenga en cuenta que si la petición actual es una devolución de envío, los valores
     * de propiedad de los componentes <strong>no</strong> representan ningún
     * valor enviado con esta petición.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se procesó.</p>
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
            log("A\361adirMedico Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Realizar inicio de aplicación que debe finalizar
        // *después* de que se inicien los componentes administrados
        // TODO - Agregar código de inicio propio aquí

    }

    /** 
     * <p>Método de devolución de llamada al que se llama cuando el árbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este método
     * <strong>sólo</strong> se llamará en una petición de devolución de envío que
     * esté procesando el envío de un formulario.  Puede personalizar este método para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    public void preprocess() {
    }

    /** 
     * <p>Método de devolución de llamada al que se llama justo antes del procesamiento.
     * <strong>Sólo</strong> se llamará a este método en la página que
     * se procesa, no se llamará, por ejemplo, en una página que
     * ha procesado una devolución de envío y a continuación ha navegado hasta otra página.  Puede personalizar
     * este método para asignar recursos necesarios para procesar
     * esta página.</p>
     */
    public void prerender() {
    }

    /** 
     * <p>Método de devolución de llamada al que se llama cuando se completa el procesamiento de
     * esta petición, si se llamó al método <code>init()</code> (sin tener en cuenta
     * si se trata de la página que se ha procesado o no).  Puede personalizar este
     * método para liberar los recursos adquiridos en los métodos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecución de un controlador de eventos).</p>
     */
    public void destroy() {
    }
}

