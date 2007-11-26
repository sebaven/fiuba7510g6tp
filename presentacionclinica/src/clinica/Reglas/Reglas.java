/*
 * Reglas.java
 *
 * Created on 25 de noviembre de 2007, 02:41
 * Copyright seba
 */
package clinica.Reglas;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageAlert;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.Alert;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.sun.rave.web.ui.component.Hyperlink;
import javax.faces.event.ValueChangeEvent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Reglas extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        rbgConectorDeSubReglas1DefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("Y", "Y"), new com.sun.rave.web.ui.model.Option("O", "O"), new com.sun.rave.web.ui.model.Option("Finalizada", "Finalizada")});
        rbgConectorDeSubReglas1DefaultOptions.setSelectedValue("Finalizada");
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

    private TextField txbValorLimitante2SubRegla1 = new TextField();

    public TextField getTxbValorLimitante2SubRegla1() {
        return txbValorLimitante2SubRegla1;
    }

    public void setTxbValorLimitante2SubRegla1(TextField tf) {
        this.txbValorLimitante2SubRegla1 = tf;
    }

    private DropDown ddlLimitante2SubRegla1 = new DropDown();

    public DropDown getDdlLimitante2SubRegla1() {
        return ddlLimitante2SubRegla1;
    }

    public void setDdlLimitante2SubRegla1(DropDown dd) {
        this.ddlLimitante2SubRegla1 = dd;
    }

    private StaticText lblPrestaciones1 = new StaticText();

    public StaticText getLblPrestaciones1() {
        return lblPrestaciones1;
    }

    public void setLblPrestaciones1(StaticText st) {
        this.lblPrestaciones1 = st;
    }

    private DropDown ddlCumpleSubRegla1 = new DropDown();

    public DropDown getDdlCumpleSubRegla1() {
        return ddlCumpleSubRegla1;
    }

    public void setDdlCumpleSubRegla1(DropDown dd) {
        this.ddlCumpleSubRegla1 = dd;
    }

    private TextField txbValorLimitante1SubRegla1 = new TextField();

    public TextField getTxbValorLimitante1SubRegla1() {
        return txbValorLimitante1SubRegla1;
    }

    public void setTxbValorLimitante1SubRegla1(TextField tf) {
        this.txbValorLimitante1SubRegla1 = tf;
    }

    private DropDown ddlNoCumpleSubRegla1 = new DropDown();

    public DropDown getDdlNoCumpleSubRegla1() {
        return ddlNoCumpleSubRegla1;
    }

    public void setDdlNoCumpleSubRegla1(DropDown dd) {
        this.ddlNoCumpleSubRegla1 = dd;
    }

    private StaticText lblDeLimitante2SubRegla1 = new StaticText();

    public StaticText getLblDeLimitante2SubRegla1() {
        return lblDeLimitante2SubRegla1;
    }

    public void setLblDeLimitante2SubRegla1(StaticText st) {
        this.lblDeLimitante2SubRegla1 = st;
    }

    private StaticText lblEnLimitante1SubRegla1 = new StaticText();

    public StaticText getLblEnLimitante1SubRegla1() {
        return lblEnLimitante1SubRegla1;
    }

    public void setLblEnLimitante1SubRegla1(StaticText st) {
        this.lblEnLimitante1SubRegla1 = st;
    }

    private DropDown ddlBusquedaLimitante2SubRegla1 = new DropDown();

    public DropDown getDdlBusquedaLimitante2SubRegla1() {
        return ddlBusquedaLimitante2SubRegla1;
    }

    public void setDdlBusquedaLimitante2SubRegla1(DropDown dd) {
        this.ddlBusquedaLimitante2SubRegla1 = dd;
    }

    private StaticText lblEnLimitante2SubRegla1 = new StaticText();

    public StaticText getLblEnLimitante2SubRegla1() {
        return lblEnLimitante2SubRegla1;
    }

    public void setLblEnLimitante2SubRegla1(StaticText st) {
        this.lblEnLimitante2SubRegla1 = st;
    }

    private TextField txbTiempoDeBusquedaLimitante1SubRegla1 = new TextField();

    public TextField getTxbTiempoDeBusquedaLimitante1SubRegla1() {
        return txbTiempoDeBusquedaLimitante1SubRegla1;
    }

    public void setTxbTiempoDeBusquedaLimitante1SubRegla1(TextField tf) {
        this.txbTiempoDeBusquedaLimitante1SubRegla1 = tf;
    }

    private Button btnSumarLimitante1SubRegla1 = new Button();

    public Button getBtnSumarLimitante1SubRegla1() {
        return btnSumarLimitante1SubRegla1;
    }

    public void setBtnSumarLimitante1SubRegla1(Button b) {
        this.btnSumarLimitante1SubRegla1 = b;
    }

    private DropDown ddlParametroDeBusquedaLimitante1SubRegla1 = new DropDown();

    public DropDown getDdlParametroDeBusquedaLimitante1SubRegla1() {
        return ddlParametroDeBusquedaLimitante1SubRegla1;
    }

    public void setDdlParametroDeBusquedaLimitante1SubRegla1(DropDown dd) {
        this.ddlParametroDeBusquedaLimitante1SubRegla1 = dd;
    }

    private Listbox lbxLimitante1SubRegla1 = new Listbox();

    public Listbox getLbxLimitante1SubRegla1() {
        return lbxLimitante1SubRegla1;
    }

    public void setLbxLimitante1SubRegla1(Listbox l) {
        this.lbxLimitante1SubRegla1 = l;
    }

    private DropDown ddlNoCumpleSubRegla2 = new DropDown();

    public DropDown getDdlNoCumpleSubRegla2() {
        return ddlNoCumpleSubRegla2;
    }

    public void setDdlNoCumpleSubRegla2(DropDown dd) {
        this.ddlNoCumpleSubRegla2 = dd;
    }

    private DropDown ddlLimitante1SubRegla1 = new DropDown();

    public DropDown getDdlLimitante1SubRegla1() {
        return ddlLimitante1SubRegla1;
    }

    public void setDdlLimitante1SubRegla1(DropDown dd) {
        this.ddlLimitante1SubRegla1 = dd;
    }

    private Button btnEliminarLimitante1SubRegla1 = new Button();

    public Button getBtnEliminarLimitante1SubRegla1() {
        return btnEliminarLimitante1SubRegla1;
    }

    public void setBtnEliminarLimitante1SubRegla1(Button b) {
        this.btnEliminarLimitante1SubRegla1 = b;
    }

    private StaticText lblLimitante1SubRegla1 = new StaticText();

    public StaticText getLblLimitante1SubRegla1() {
        return lblLimitante1SubRegla1;
    }

    public void setLblLimitante1SubRegla1(StaticText st) {
        this.lblLimitante1SubRegla1 = st;
    }

    private DropDown ddlPlan1 = new DropDown();

    public DropDown getDdlPlan1() {
        return ddlPlan1;
    }

    public void setDdlPlan1(DropDown dd) {
        this.ddlPlan1 = dd;
    }

    private StaticText lblDeLimitante1SubRegla1 = new StaticText();

    public StaticText getLblDeLimitante1SubRegla1() {
        return lblDeLimitante1SubRegla1;
    }

    public void setLblDeLimitante1SubRegla1(StaticText st) {
        this.lblDeLimitante1SubRegla1 = st;
    }

    private DropDown ddlLimitante2SubRegla2 = new DropDown();

    public DropDown getDdlLimitante2SubRegla2() {
        return ddlLimitante2SubRegla2;
    }

    public void setDdlLimitante2SubRegla2(DropDown dd) {
        this.ddlLimitante2SubRegla2 = dd;
    }

    private StaticText lblDeLimitante2SubRegla2 = new StaticText();

    public StaticText getLblDeLimitante2SubRegla2() {
        return lblDeLimitante2SubRegla2;
    }

    public void setLblDeLimitante2SubRegla2(StaticText st) {
        this.lblDeLimitante2SubRegla2 = st;
    }

    private Button btnModificarRegla1 = new Button();

    public Button getBtnModificarRegla1() {
        return btnModificarRegla1;
    }

    public void setBtnModificarRegla1(Button b) {
        this.btnModificarRegla1 = b;
    }

    private StaticText lblCumpleSubRegla1 = new StaticText();

    public StaticText getLblCumpleSubRegla1() {
        return lblCumpleSubRegla1;
    }

    public void setLblCumpleSubRegla1(StaticText st) {
        this.lblCumpleSubRegla1 = st;
    }

    private StaticText lblNoCumpleSubRegla1 = new StaticText();

    public StaticText getLblNoCumpleSubRegla1() {
        return lblNoCumpleSubRegla1;
    }

    public void setLblNoCumpleSubRegla1(StaticText st) {
        this.lblNoCumpleSubRegla1 = st;
    }

    private RadioButtonGroup rbgConectorDeSubReglas1 = new RadioButtonGroup();

    public RadioButtonGroup getRbgConectorDeSubReglas1() {
        return rbgConectorDeSubReglas1;
    }

    public void setRbgConectorDeSubReglas1(RadioButtonGroup rbg) {
        this.rbgConectorDeSubReglas1 = rbg;
    }

    private TextField txbTiempoDeBusquedaLimitante1SubRegla2 = new TextField();

    public TextField getTxbTiempoDeBusquedaLimitante1SubRegla2() {
        return txbTiempoDeBusquedaLimitante1SubRegla2;
    }

    public void setTxbTiempoDeBusquedaLimitante1SubRegla2(TextField tf) {
        this.txbTiempoDeBusquedaLimitante1SubRegla2 = tf;
    }

    private DropDown ddlParametroDeBusquedaLimitante1SubRegla2 = new DropDown();

    public DropDown getDdlParametroDeBusquedaLimitante1SubRegla2() {
        return ddlParametroDeBusquedaLimitante1SubRegla2;
    }

    public void setDdlParametroDeBusquedaLimitante1SubRegla2(DropDown dd) {
        this.ddlParametroDeBusquedaLimitante1SubRegla2 = dd;
    }

    private DropDown ddlBusquedaLimitante1SubRegla1 = new DropDown();

    public DropDown getDdlBusquedaLimitante1SubRegla1() {
        return ddlBusquedaLimitante1SubRegla1;
    }

    public void setDdlBusquedaLimitante1SubRegla1(DropDown dd) {
        this.ddlBusquedaLimitante1SubRegla1 = dd;
    }

    private Listbox lbxLimitante1SubRegla2 = new Listbox();

    public Listbox getLbxLimitante1SubRegla2() {
        return lbxLimitante1SubRegla2;
    }

    public void setLbxLimitante1SubRegla2(Listbox l) {
        this.lbxLimitante1SubRegla2 = l;
    }

    private StaticText lblPlan1 = new StaticText();

    public StaticText getLblPlan1() {
        return lblPlan1;
    }

    public void setLblPlan1(StaticText st) {
        this.lblPlan1 = st;
    }

    private DropDown ddlBusquedaLimitante2SubRegla2 = new DropDown();

    public DropDown getDdlBusquedaLimitante2SubRegla2() {
        return ddlBusquedaLimitante2SubRegla2;
    }

    public void setDdlBusquedaLimitante2SubRegla2(DropDown dd) {
        this.ddlBusquedaLimitante2SubRegla2 = dd;
    }

    private StaticText lblDeLimitante1SubRegla2 = new StaticText();

    public StaticText getLblDeLimitante1SubRegla2() {
        return lblDeLimitante1SubRegla2;
    }

    public void setLblDeLimitante1SubRegla2(StaticText st) {
        this.lblDeLimitante1SubRegla2 = st;
    }

    private StaticText lblCumpleSubRegla2 = new StaticText();

    public StaticText getLblCumpleSubRegla2() {
        return lblCumpleSubRegla2;
    }

    public void setLblCumpleSubRegla2(StaticText st) {
        this.lblCumpleSubRegla2 = st;
    }

    private TextField txbValorLimitante2SubRegla2 = new TextField();

    public TextField getTxbValorLimitante2SubRegla2() {
        return txbValorLimitante2SubRegla2;
    }

    public void setTxbValorLimitante2SubRegla2(TextField tf) {
        this.txbValorLimitante2SubRegla2 = tf;
    }

    private DropDown ddlParametroDeBusquedaLimitante2SubRegla1 = new DropDown();

    public DropDown getDdlParametroDeBusquedaLimitante2SubRegla1() {
        return ddlParametroDeBusquedaLimitante2SubRegla1;
    }

    public void setDdlParametroDeBusquedaLimitante2SubRegla1(DropDown dd) {
        this.ddlParametroDeBusquedaLimitante2SubRegla1 = dd;
    }

    private DropDown ddlComparadorSubRegla1 = new DropDown();

    public DropDown getDdlComparadorSubRegla1() {
        return ddlComparadorSubRegla1;
    }

    public void setDdlComparadorSubRegla1(DropDown dd) {
        this.ddlComparadorSubRegla1 = dd;
    }

    private TextField txbTiempoDeBusquedaLimitante2SubRegla1 = new TextField();

    public TextField getTxbTiempoDeBusquedaLimitante2SubRegla1() {
        return txbTiempoDeBusquedaLimitante2SubRegla1;
    }

    public void setTxbTiempoDeBusquedaLimitante2SubRegla1(TextField tf) {
        this.txbTiempoDeBusquedaLimitante2SubRegla1 = tf;
    }

    private Button btnEliminarRegla1 = new Button();

    public Button getBtnEliminarRegla1() {
        return btnEliminarRegla1;
    }

    public void setBtnEliminarRegla1(Button b) {
        this.btnEliminarRegla1 = b;
    }

    private DropDown ddlParametroDeBusquedaLimitante2SubRegla2 = new DropDown();

    public DropDown getDdlParametroDeBusquedaLimitante2SubRegla2() {
        return ddlParametroDeBusquedaLimitante2SubRegla2;
    }

    public void setDdlParametroDeBusquedaLimitante2SubRegla2(DropDown dd) {
        this.ddlParametroDeBusquedaLimitante2SubRegla2 = dd;
    }

    private TextField txbTiempoDeBusquedaLimitante2SubRegla2 = new TextField();

    public TextField getTxbTiempoDeBusquedaLimitante2SubRegla2() {
        return txbTiempoDeBusquedaLimitante2SubRegla2;
    }

    public void setTxbTiempoDeBusquedaLimitante2SubRegla2(TextField tf) {
        this.txbTiempoDeBusquedaLimitante2SubRegla2 = tf;
    }

    private DropDown ddlComparadorSubRegla2 = new DropDown();

    public DropDown getDdlComparadorSubRegla2() {
        return ddlComparadorSubRegla2;
    }

    public void setDdlComparadorSubRegla2(DropDown dd) {
        this.ddlComparadorSubRegla2 = dd;
    }

    private Button btnSumarLimitante1SubRegla2 = new Button();

    public Button getBtnSumarLimitante1SubRegla2() {
        return btnSumarLimitante1SubRegla2;
    }

    public void setBtnSumarLimitante1SubRegla2(Button b) {
        this.btnSumarLimitante1SubRegla2 = b;
    }

    private Listbox lbxPrestaciones1 = new Listbox();

    public Listbox getLbxPrestaciones1() {
        return lbxPrestaciones1;
    }

    public void setLbxPrestaciones1(Listbox l) {
        this.lbxPrestaciones1 = l;
    }

    private DropDown ddlLimitante1SubRegla2 = new DropDown();

    public DropDown getDdlLimitante1SubRegla2() {
        return ddlLimitante1SubRegla2;
    }

    public void setDdlLimitante1SubRegla2(DropDown dd) {
        this.ddlLimitante1SubRegla2 = dd;
    }

    private TextField txbValorLimitante1SubRegla2 = new TextField();

    public TextField getTxbValorLimitante1SubRegla2() {
        return txbValorLimitante1SubRegla2;
    }

    public void setTxbValorLimitante1SubRegla2(TextField tf) {
        this.txbValorLimitante1SubRegla2 = tf;
    }

    private DropDown ddlCumpleSubRegla2 = new DropDown();

    public DropDown getDdlCumpleSubRegla2() {
        return ddlCumpleSubRegla2;
    }

    public void setDdlCumpleSubRegla2(DropDown dd) {
        this.ddlCumpleSubRegla2 = dd;
    }

    private StaticText lblLimitante2SubRegla1 = new StaticText();

    public StaticText getLblLimitante2SubRegla1() {
        return lblLimitante2SubRegla1;
    }

    public void setLblLimitante2SubRegla1(StaticText st) {
        this.lblLimitante2SubRegla1 = st;
    }

    private StaticText lblEnLimitante1SubRegla2 = new StaticText();

    public StaticText getLblEnLimitante1SubRegla2() {
        return lblEnLimitante1SubRegla2;
    }

    public void setLblEnLimitante1SubRegla2(StaticText st) {
        this.lblEnLimitante1SubRegla2 = st;
    }

    private StaticText lblLimitante1SubRegla2 = new StaticText();

    public StaticText getLblLimitante1SubRegla2() {
        return lblLimitante1SubRegla2;
    }

    public void setLblLimitante1SubRegla2(StaticText st) {
        this.lblLimitante1SubRegla2 = st;
    }

    private StaticText lblNoCumpleSubRegla2 = new StaticText();

    public StaticText getLblNoCumpleSubRegla2() {
        return lblNoCumpleSubRegla2;
    }

    public void setLblNoCumpleSubRegla2(StaticText st) {
        this.lblNoCumpleSubRegla2 = st;
    }

    private StaticText lblEnLimitante2SubRegla2 = new StaticText();

    public StaticText getLblEnLimitante2SubRegla2() {
        return lblEnLimitante2SubRegla2;
    }

    public void setLblEnLimitante2SubRegla2(StaticText st) {
        this.lblEnLimitante2SubRegla2 = st;
    }

    private Button btnEliminarLimitante1SubRegla2 = new Button();

    public Button getBtnEliminarLimitante1SubRegla2() {
        return btnEliminarLimitante1SubRegla2;
    }

    public void setBtnEliminarLimitante1SubRegla2(Button b) {
        this.btnEliminarLimitante1SubRegla2 = b;
    }

    private StaticText lblTitulo1 = new StaticText();

    public StaticText getLblTitulo1() {
        return lblTitulo1;
    }

    public void setLblTitulo1(StaticText st) {
        this.lblTitulo1 = st;
    }

    private DropDown ddlBusquedaLimitante1SubRegla2 = new DropDown();

    public DropDown getDdlBusquedaLimitante1SubRegla2() {
        return ddlBusquedaLimitante1SubRegla2;
    }

    public void setDdlBusquedaLimitante1SubRegla2(DropDown dd) {
        this.ddlBusquedaLimitante1SubRegla2 = dd;
    }

    private StaticText lblRegla1 = new StaticText();

    public StaticText getLblRegla1() {
        return lblRegla1;
    }

    public void setLblRegla1(StaticText st) {
        this.lblRegla1 = st;
    }

    private StaticText lblLimitante2SubRegla2 = new StaticText();

    public StaticText getLblLimitante2SubRegla2() {
        return lblLimitante2SubRegla2;
    }

    public void setLblLimitante2SubRegla2(StaticText st) {
        this.lblLimitante2SubRegla2 = st;
    }

    private SingleSelectOptionsList ddlLimitante2SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlLimitante2SubRegla1DefaultOptions() {
        return ddlLimitante2SubRegla1DefaultOptions;
    }

    public void setDdlLimitante2SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlLimitante2SubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlCumpleSubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlCumpleSubRegla1DefaultOptions() {
        return ddlCumpleSubRegla1DefaultOptions;
    }

    public void setDdlCumpleSubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlCumpleSubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlNoCumpleSubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlNoCumpleSubRegla1DefaultOptions() {
        return ddlNoCumpleSubRegla1DefaultOptions;
    }

    public void setDdlNoCumpleSubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlNoCumpleSubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlBusquedaLimitante2SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlBusquedaLimitante2SubRegla1DefaultOptions() {
        return ddlBusquedaLimitante2SubRegla1DefaultOptions;
    }

    public void setDdlBusquedaLimitante2SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlBusquedaLimitante2SubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlParametroDeBusquedaLimitante1SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlParametroDeBusquedaLimitante1SubRegla1DefaultOptions() {
        return ddlParametroDeBusquedaLimitante1SubRegla1DefaultOptions;
    }

    public void setDdlParametroDeBusquedaLimitante1SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlParametroDeBusquedaLimitante1SubRegla1DefaultOptions = ssol;
    }

    private DefaultOptionsList lbxLimitante1SubRegla1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxLimitante1SubRegla1DefaultOptions() {
        return lbxLimitante1SubRegla1DefaultOptions;
    }

    public void setLbxLimitante1SubRegla1DefaultOptions(DefaultOptionsList dol) {
        this.lbxLimitante1SubRegla1DefaultOptions = dol;
    }

    private SingleSelectOptionsList ddlNoCumpleSubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlNoCumpleSubRegla2DefaultOptions() {
        return ddlNoCumpleSubRegla2DefaultOptions;
    }

    public void setDdlNoCumpleSubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlNoCumpleSubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlLimitante1SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlLimitante1SubRegla1DefaultOptions() {
        return ddlLimitante1SubRegla1DefaultOptions;
    }

    public void setDdlLimitante1SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlLimitante1SubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlPlan1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlPlan1DefaultOptions() {
        return ddlPlan1DefaultOptions;
    }

    public void setDdlPlan1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlPlan1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlLimitante2SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlLimitante2SubRegla2DefaultOptions() {
        return ddlLimitante2SubRegla2DefaultOptions;
    }

    public void setDdlLimitante2SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlLimitante2SubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList rbgConectorDeSubReglas1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRbgConectorDeSubReglas1DefaultOptions() {
        return rbgConectorDeSubReglas1DefaultOptions;
    }

    public void setRbgConectorDeSubReglas1DefaultOptions(SingleSelectOptionsList ssol) {
        this.rbgConectorDeSubReglas1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlParametroDeBusquedaLimitante1SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlParametroDeBusquedaLimitante1SubRegla2DefaultOptions() {
        return ddlParametroDeBusquedaLimitante1SubRegla2DefaultOptions;
    }

    public void setDdlParametroDeBusquedaLimitante1SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlParametroDeBusquedaLimitante1SubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlBusquedaLimitante1SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlBusquedaLimitante1SubRegla1DefaultOptions() {
        return ddlBusquedaLimitante1SubRegla1DefaultOptions;
    }

    public void setDdlBusquedaLimitante1SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlBusquedaLimitante1SubRegla1DefaultOptions = ssol;
    }

    private DefaultOptionsList lbxLimitante1SubRegla2DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxLimitante1SubRegla2DefaultOptions() {
        return lbxLimitante1SubRegla2DefaultOptions;
    }

    public void setLbxLimitante1SubRegla2DefaultOptions(DefaultOptionsList dol) {
        this.lbxLimitante1SubRegla2DefaultOptions = dol;
    }

    private SingleSelectOptionsList ddlBusquedaLimitante2SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlBusquedaLimitante2SubRegla2DefaultOptions() {
        return ddlBusquedaLimitante2SubRegla2DefaultOptions;
    }

    public void setDdlBusquedaLimitante2SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlBusquedaLimitante2SubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlParametroDeBusquedaLimitante2SubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlParametroDeBusquedaLimitante2SubRegla1DefaultOptions() {
        return ddlParametroDeBusquedaLimitante2SubRegla1DefaultOptions;
    }

    public void setDdlParametroDeBusquedaLimitante2SubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlParametroDeBusquedaLimitante2SubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlComparadorSubRegla1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlComparadorSubRegla1DefaultOptions() {
        return ddlComparadorSubRegla1DefaultOptions;
    }

    public void setDdlComparadorSubRegla1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlComparadorSubRegla1DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlParametroDeBusquedaLimitante2SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlParametroDeBusquedaLimitante2SubRegla2DefaultOptions() {
        return ddlParametroDeBusquedaLimitante2SubRegla2DefaultOptions;
    }

    public void setDdlParametroDeBusquedaLimitante2SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlParametroDeBusquedaLimitante2SubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlComparadorSubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlComparadorSubRegla2DefaultOptions() {
        return ddlComparadorSubRegla2DefaultOptions;
    }

    public void setDdlComparadorSubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlComparadorSubRegla2DefaultOptions = ssol;
    }

    private DefaultOptionsList lbxPrestaciones1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getLbxPrestaciones1DefaultOptions() {
        return lbxPrestaciones1DefaultOptions;
    }

    public void setLbxPrestaciones1DefaultOptions(DefaultOptionsList dol) {
        this.lbxPrestaciones1DefaultOptions = dol;
    }

    private SingleSelectOptionsList ddlLimitante1SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlLimitante1SubRegla2DefaultOptions() {
        return ddlLimitante1SubRegla2DefaultOptions;
    }

    public void setDdlLimitante1SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlLimitante1SubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlCumpleSubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlCumpleSubRegla2DefaultOptions() {
        return ddlCumpleSubRegla2DefaultOptions;
    }

    public void setDdlCumpleSubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlCumpleSubRegla2DefaultOptions = ssol;
    }

    private SingleSelectOptionsList ddlBusquedaLimitante1SubRegla2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlBusquedaLimitante1SubRegla2DefaultOptions() {
        return ddlBusquedaLimitante1SubRegla2DefaultOptions;
    }

    public void setDdlBusquedaLimitante1SubRegla2DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlBusquedaLimitante1SubRegla2DefaultOptions = ssol;
    }
    
    // </editor-fold>


    /** 
     * <p>Construir una instancia de bean de página.</p>
     */
    public Reglas() {
        lblCumpleSubRegla2.setVisible(false);
        lblDeLimitante1SubRegla2.setVisible(false);
        lblDeLimitante2SubRegla2.setVisible(false);
        lblEnLimitante1SubRegla2.setVisible(false);
        lblEnLimitante2SubRegla2.setVisible(false);
        lblLimitante1SubRegla2.setVisible(false);
        lblLimitante2SubRegla2.setVisible(false);
        lblNoCumpleSubRegla2.setVisible(false);
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
            log("Reglas Initialization Failure", e);
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


    public String button1_action() {
        // TODO: Procesar la acción de clic de botón. El valor de devolución es un
        // nombre de caso de navegación en el que un valor nulo devolverá la misma página.
        
        return null;
    }


    public String btnEliminarRegla_action() {
        // TODO: Procesar la acción de clic de botón. El valor de devolución es un
        // nombre de caso de navegación en el que un valor nulo devolverá la misma página.
        return null;
    }


    public String btnSumarLimitante1SubRegla1_action() {
        // TODO: Procesar la acción de clic de botón. El valor de devolución es un
        // nombre de caso de navegación en el que un valor nulo devolverá la misma página.
        
        return null;
    }


    public void rbgConectorDeSubReglas1_processValueChange(ValueChangeEvent event) {
        // TODO: Reemplazar con código del usuario
        if (event.getNewValue().toString().compareTo("Finalizada")==0)
        {
            lblCumpleSubRegla2.setVisible(false);
            lblDeLimitante1SubRegla2.setVisible(false);
            lblDeLimitante2SubRegla2.setVisible(false);
            lblEnLimitante1SubRegla2.setVisible(false);
            lblEnLimitante2SubRegla2.setVisible(false);
            lblLimitante1SubRegla2.setVisible(false);
            lblLimitante2SubRegla2.setVisible(false);
            lblNoCumpleSubRegla2.setVisible(false);
        } else if (event.getNewValue().toString().compareTo("Y")==0)
        {
            lblCumpleSubRegla2.setVisible(true);
            lblDeLimitante1SubRegla2.setVisible(true);
            lblDeLimitante2SubRegla2.setVisible(true);
            lblEnLimitante1SubRegla2.setVisible(true);
            lblEnLimitante2SubRegla2.setVisible(true);
            lblLimitante1SubRegla2.setVisible(true);
            lblLimitante2SubRegla2.setVisible(true);
            lblNoCumpleSubRegla2.setVisible(true);
            ddlCumpleSubRegla1.setDisabled(true);
        } else {
            lblCumpleSubRegla2.setVisible(true);
            lblDeLimitante1SubRegla2.setVisible(true);
            lblDeLimitante2SubRegla2.setVisible(true);
            lblEnLimitante1SubRegla2.setVisible(true);
            lblEnLimitante2SubRegla2.setVisible(true);
            lblLimitante1SubRegla2.setVisible(true);
            lblLimitante2SubRegla2.setVisible(true);
            lblNoCumpleSubRegla2.setVisible(true);
            ddlNoCumpleSubRegla1.setDisabled(true);
        }
    }


    public void rbgConectorDeSubReglas1_validate(FacesContext context, UIComponent component, Object value) {
        // TODO: Reemplazar con código del usuario
        
    }
}

