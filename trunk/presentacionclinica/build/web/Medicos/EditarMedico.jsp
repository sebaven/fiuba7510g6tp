<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Medicos$EditarMedico.page1}" id="page1">
            <ui:html binding="#{Medicos$EditarMedico.html1}" id="html1">
                <ui:head binding="#{Medicos$EditarMedico.head1}" id="head1">
                    <ui:link binding="#{Medicos$EditarMedico.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Medicos$EditarMedico.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Medicos$EditarMedico.form1}" id="form1">
                        <ui:staticText binding="#{Medicos$EditarMedico.lblTitulo}" id="lblTitulo" style="left: 720px; top: 24px; position: absolute" text="Editar Medico"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbDNI}" id="txbDNI" style="left: 336px; top: 168px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblHospital}" id="lblHospital" style="left: 264px; top: 336px; position: absolute" text="Hospital"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblCUIT}" id="lblCUIT" style="left: 240px; top: 216px; position: absolute" text="CUIT"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblTelefono}" id="lblTelefono" style="left: 792px; top: 168px; position: absolute" text="Teléfono"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbTelefono}" id="txbTelefono" style="left: 888px; top: 168px; position: absolute"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbApellido}" id="txbApellido" style="left: 336px; top: 144px; position: absolute"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbNombre}" id="txbNombre" style="left: 336px; top: 120px; position: absolute"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbLocalidad}" id="txbLocalidad" style="left: 888px; top: 144px; position: absolute"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbDireccion}" id="txbDireccion" style="left: 888px; top: 120px; position: absolute"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbEmail}" id="txbEmail" style="left: 888px; top: 192px; position: absolute"/>
                        <ui:listbox binding="#{Medicos$EditarMedico.lbxEspecialidades}" id="lbxEspecialidades"
                            items="#{Medicos$EditarMedico.lbxEspecialidadesDefaultOptions.options}" style="left: 264px; top: 408px; position: absolute; width: 840px"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblEspecialidades}" id="lblEspecialidades"
                            style="left: 264px; top: 384px; position: absolute" text="Especialidades"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblEmail}" id="lblEmail" style="left: 792px; top: 192px; position: absolute" text="Email"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblDatosPersonales}" id="lblDatosPersonales"
                            style="left: 264px; top: 72px; position: absolute" text="Datos Personales"/>
                        <ui:button binding="#{Medicos$EditarMedico.btnSubmit}" id="btnSubmit" style="left: 623px; top: 648px; position: absolute" text="Guardar Cambios"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblApellido}" id="lblApellido" style="left: 240px; top: 144px; position: absolute" text="Apellido"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblDNI}" id="lblDNI" style="left: 240px; top: 168px; position: absolute" text="DNI"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblDireccion}" id="lblDireccion" style="left: 792px; top: 120px; position: absolute" text="Dirección"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblLocalidad}" id="lblLocalidad" style="left: 792px; top: 144px; position: absolute" text="Localidad"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbCUIT}" id="txbCUIT" style="left: 336px; top: 216px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblDatosProfesionales}" id="lblDatosProfesionales"
                            style="left: 264px; top: 288px; position: absolute" text="Datos Profesionales"/>
                        <ui:textField binding="#{Medicos$EditarMedico.txbHospital}" id="txbHospital" style="left: 360px; top: 336px; position: absolute"/>
                        <ui:staticText binding="#{Medicos$EditarMedico.lblNombre}" id="lblNombre" style="left: 240px; top: 120px; position: absolute" text="Nombre"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
