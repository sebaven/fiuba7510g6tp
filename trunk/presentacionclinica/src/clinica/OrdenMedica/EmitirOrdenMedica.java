/*
 * EmitirOrdenMedica.java
 *
 * Created on 23 de noviembre de 2007, 02:31
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
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.model.DefaultOptionsList;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class EmitirOrdenMedica extends AbstractPageBean {
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

    private StaticText lblPaciente = new StaticText();

    public StaticText getLblPaciente() {
        return lblPaciente;
    }

    public void setLblPaciente(StaticText st) {
        this.lblPaciente = st;
    }

    private StaticText lblNombrePaciente = new StaticText();

    public StaticText getLblNombrePaciente() {
        return lblNombrePaciente;
    }

    public void setLblNombrePaciente(StaticText st) {
        this.lblNombrePaciente = st;
    }

    private StaticText lblApellidoPaciente = new StaticText();

    public StaticText getLblApellidoPaciente() {
        return lblApellidoPaciente;
    }

    public void setLblApellidoPaciente(StaticText st) {
        this.lblApellidoPaciente = st;
    }

    private TextField txbNombrePaciente = new TextField();

    public TextField getTxbNombrePaciente() {
        return txbNombrePaciente;
    }

    public void setTxbNombrePaciente(TextField tf) {
        this.txbNombrePaciente = tf;
    }

    private TextField txbApellidoPaciente = new TextField();

    public TextField getTxbApellidoPaciente() {
        return txbApellidoPaciente;
    }

    public void setTxbApellidoPaciente(TextField tf) {
        this.txbApellidoPaciente = tf;
    }

    private Button btnBuscarPaciente = new Button();

    public Button getBtnBuscarPaciente() {
        return btnBuscarPaciente;
    }

    public void setBtnBuscarPaciente(Button b) {
        this.btnBuscarPaciente = b;
    }

    private StaticText lblDNIPaciente = new StaticText();

    public StaticText getLblDNIPaciente() {
        return lblDNIPaciente;
    }

    public void setLblDNIPaciente(StaticText st) {
        this.lblDNIPaciente = st;
    }

    private StaticText lblPlan = new StaticText();

    public StaticText getLblPlan() {
        return lblPlan;
    }

    public void setLblPlan(StaticText st) {
        this.lblPlan = st;
    }

    private StaticText lblMedico = new StaticText();

    public StaticText getLblMedico() {
        return lblMedico;
    }

    public void setLblMedico(StaticText st) {
        this.lblMedico = st;
    }

    private TextField txbDNIPaciente = new TextField();

    public TextField getTxbDNIPaciente() {
        return txbDNIPaciente;
    }

    public void setTxbDNIPaciente(TextField tf) {
        this.txbDNIPaciente = tf;
    }

    private TextField txbPlan = new TextField();

    public TextField getTxbPlan() {
        return txbPlan;
    }

    public void setTxbPlan(TextField tf) {
        this.txbPlan = tf;
    }

    private Button btnDetallesPaciente = new Button();

    public Button getBtnDetallesPaciente() {
        return btnDetallesPaciente;
    }

    public void setBtnDetallesPaciente(Button b) {
        this.btnDetallesPaciente = b;
    }

    private StaticText lblNombreMedico = new StaticText();

    public StaticText getLblNombreMedico() {
        return lblNombreMedico;
    }

    public void setLblNombreMedico(StaticText st) {
        this.lblNombreMedico = st;
    }

    private TextField txbNombreMedico = new TextField();

    public TextField getTxbNombreMedico() {
        return txbNombreMedico;
    }

    public void setTxbNombreMedico(TextField tf) {
        this.txbNombreMedico = tf;
    }

    private StaticText lblApellidoMedico = new StaticText();

    public StaticText getLblApellidoMedico() {
        return lblApellidoMedico;
    }

    public void setLblApellidoMedico(StaticText st) {
        this.lblApellidoMedico = st;
    }

    private TextField txbApellidoMedico = new TextField();

    public TextField getTxbApellidoMedico() {
        return txbApellidoMedico;
    }

    public void setTxbApellidoMedico(TextField tf) {
        this.txbApellidoMedico = tf;
    }

    private StaticText lblDNIMedico = new StaticText();

    public StaticText getLblDNIMedico() {
        return lblDNIMedico;
    }

    public void setLblDNIMedico(StaticText st) {
        this.lblDNIMedico = st;
    }

    private TextField txbDNIMedico = new TextField();

    public TextField getTxbDNIMedico() {
        return txbDNIMedico;
    }

    public void setTxbDNIMedico(TextField tf) {
        this.txbDNIMedico = tf;
    }

    private StaticText lblOrden = new StaticText();

    public StaticText getLblOrden() {
        return lblOrden;
    }

    public void setLblOrden(StaticText st) {
        this.lblOrden = st;
    }

    private Listbox lbxOrden = new Listbox();

    public Listbox getLbxOrden() {
        return lbxOrden;
    }

    public void setLbxOrden(Listbox l) {
        this.lbxOrden = l;
    }

    private DefaultOptionsList lbxOrdenDefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxOrdenDefaultOptions() {
        return lbxOrdenDefaultOptions;
    }

    public void setLbxOrdenDefaultOptions(DefaultOptionsList dol) {
        this.lbxOrdenDefaultOptions = dol;
    }

    private Button btnAgregarItem = new Button();

    public Button getBtnAgregarItem() {
        return btnAgregarItem;
    }

    public void setBtnAgregarItem(Button b) {
        this.btnAgregarItem = b;
    }

    private Button btnEliminarItem = new Button();

    public Button getBtnEliminarItem() {
        return btnEliminarItem;
    }

    public void setBtnEliminarItem(Button b) {
        this.btnEliminarItem = b;
    }

    private Button btnEmitirOrden = new Button();

    public Button getBtnEmitirOrden() {
        return btnEmitirOrden;
    }

    public void setBtnEmitirOrden(Button b) {
        this.btnEmitirOrden = b;
    }
    
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de página.</p>
     */
    public EmitirOrdenMedica() {
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
     * <p>Devolver una referencia al bean de datos con ámbito.</p>
     */
    protected clinica.ApplicationBean1 getApplicationBean1() {
        return (clinica.ApplicationBean1)getBean("ApplicationBean1");
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
            log("EmitirOrdenMedica Initialization Failure", e);
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

