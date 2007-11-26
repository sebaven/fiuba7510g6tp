<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{OrdenMedica$DetallesDePaciente.page1}" id="page1">
            <ui:html binding="#{OrdenMedica$DetallesDePaciente.html1}" id="html1">
                <ui:head binding="#{OrdenMedica$DetallesDePaciente.head1}" id="head1">
                    <ui:link binding="#{OrdenMedica$DetallesDePaciente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{OrdenMedica$DetallesDePaciente.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{OrdenMedica$DetallesDePaciente.form1}" id="form1">
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblTitulo}" id="lblTitulo" style="position: absolute; left: 600px; top: 72px" text="Detalles del Paciente"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblNombre}" id="lblNombre" style="left: 360px; top: 144px; position: absolute" text="Nombre"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblApellido}" id="lblApellido"
                            style="position: absolute; left: 360px; top: 168px" text="Apellido"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblDNI}" id="lblDNI" style="position: absolute; left: 384px; top: 192px" text="DNI"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblPlan}" id="lblPlan" style="position: absolute; left: 384px; top: 216px" text="Plan"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblDireccion}" id="lblDireccion"
                            style="position: absolute; left: 384px; top: 240px" text="Dirección"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblTelefono}" id="lblTelefono"
                            style="left: 384px; top: 288px; position: absolute" text="Teléfono"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblLocalidad}" id="lblLocalidad"
                            style="left: 360px; top: 264px; position: absolute" text="Localidad"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblEmail}" id="lblEmail" style="position: absolute; left: 384px; top: 312px" text="Email"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbNombre}" id="txbNombre" style="left: 528px; top: 144px; position: absolute"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbApellido}" id="txbApellido" style="left: 528px; top: 168px; position: absolute"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbDNI}" id="txbDNI" style="position: absolute; left: 528px; top: 192px"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbPlan}" id="txbPlan" style="left: 528px; top: 216px; position: absolute"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbDireccion}" id="txbDireccion" style="position: absolute; left: 528px; top: 240px"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbLocalidad}" id="txbLocalidad" style="position: absolute; left: 528px; top: 264px"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbTelefono}" id="txbTelefono" style="position: absolute; left: 528px; top: 288px"/>
                        <ui:textField binding="#{OrdenMedica$DetallesDePaciente.txbEmail}" id="txbEmail" style="left: 528px; top: 312px; position: absolute"/>
                        <ui:staticText binding="#{OrdenMedica$DetallesDePaciente.lblHistorial}" id="lblHistorial"
                            style="position: absolute; left: 384px; top: 384px" text="Historial"/>
                        <ui:listbox binding="#{OrdenMedica$DetallesDePaciente.lbxHistorial}" id="lbxHistorial"
                            items="#{OrdenMedica$DetallesDePaciente.lbxHistorialDefaultOptions.options}" style="height: 120px; left: 384px; top: 432px; position: absolute; width: 360px"/>
                        <ui:button binding="#{OrdenMedica$DetallesDePaciente.btnObtenerHistorial}" id="btnObtenerHistorial"
                            style="position: absolute; left: 672px; top: 576px" text="Obtener Historial"/>
                        <ui:button binding="#{OrdenMedica$DetallesDePaciente.btnAceptar}" id="btnAceptar" style="position: absolute; left: 720px; top: 624px" text="Aceptar"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
