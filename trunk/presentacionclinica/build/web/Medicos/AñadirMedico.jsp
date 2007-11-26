<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Medicos$AñadirMedico.page1}" id="page1">
            <ui:html binding="#{Medicos$AñadirMedico.html1}" id="html1">
                <ui:head binding="#{Medicos$AñadirMedico.head1}" id="head1">
                    <ui:link binding="#{Medicos$AñadirMedico.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Medicos$AñadirMedico.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Medicos$AñadirMedico.form1}" id="form1">
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblTitulo1}" id="lblTitulo1" style="left: 576px; top: 0px; position: absolute" text="Añadir Medico"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbDNI1}" id="txbDNI1" style="left: 192px; top: 144px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblHospital1}" id="lblHospital1" style="left: 120px; top: 312px; position: absolute" text="Hospital"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblCUIT1}" id="lblCUIT1" style="left: 96px; top: 192px; position: absolute" text="CUIT"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblTelefono1}" id="lblTelefono1" style="left: 648px; top: 144px; position: absolute" text="Teléfono"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbTelefono1}" id="txbTelefono1" style="left: 744px; top: 144px; position: absolute"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbApellido1}" id="txbApellido1" style="left: 192px; top: 120px; position: absolute"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbNombre1}" id="txbNombre1" style="left: 192px; top: 96px; position: absolute"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbLocalidad1}" id="txbLocalidad1" style="left: 744px; top: 120px; position: absolute"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbDireccion1}" id="txbDireccion1" style="left: 744px; top: 96px; position: absolute"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbEmail1}" id="txbEmail1" style="left: 744px; top: 168px; position: absolute"/>
                        <ui:listbox binding="#{Medicos$AñadirMedico.lbxEspecialidades1}" id="lbxEspecialidades1"
                            items="#{Medicos$AñadirMedico.lbxEspecialidades1DefaultOptions.options}" style="left: 120px; top: 384px; position: absolute; width: 840px"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblEspecialidades1}" id="lblEspecialidades1"
                            style="left: 120px; top: 360px; position: absolute" text="Especialidades"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblEmail1}" id="lblEmail1" style="left: 648px; top: 168px; position: absolute" text="Email"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblDatosPersonales1}" id="lblDatosPersonales1"
                            style="left: 120px; top: 48px; position: absolute" text="Datos Personales"/>
                        <ui:button binding="#{Medicos$AñadirMedico.btnSubmit1}" id="btnSubmit1" style="left: 479px; top: 624px; position: absolute" text="Guardar Cambios"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblApellido1}" id="lblApellido1" style="left: 96px; top: 120px; position: absolute" text="Apellido"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblDNI1}" id="lblDNI1" style="left: 96px; top: 144px; position: absolute" text="DNI"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblDireccion1}" id="lblDireccion1" style="left: 648px; top: 96px; position: absolute" text="Dirección"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblLocalidad1}" id="lblLocalidad1" style="left: 648px; top: 120px; position: absolute" text="Localidad"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbCUIT1}" id="txbCUIT1" style="left: 192px; top: 192px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblDatosProfesionales1}" id="lblDatosProfesionales1"
                            style="left: 120px; top: 264px; position: absolute" text="Datos Profesionales"/>
                        <ui:textField binding="#{Medicos$AñadirMedico.txbHospital1}" id="txbHospital1" style="left: 216px; top: 312px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$AñadirMedico.lblNombre1}" id="lblNombre1" style="left: 96px; top: 96px; position: absolute" text="Nombre"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
