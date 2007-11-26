<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{OrdenMedica$BuscarPaciente.page1}" id="page1">
            <ui:html binding="#{OrdenMedica$BuscarPaciente.html1}" id="html1">
                <ui:head binding="#{OrdenMedica$BuscarPaciente.head1}" id="head1">
                    <ui:link binding="#{OrdenMedica$BuscarPaciente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{OrdenMedica$BuscarPaciente.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{OrdenMedica$BuscarPaciente.form1}" id="form1">
                        <ui:textField binding="#{OrdenMedica$BuscarPaciente.txbApellido}" id="txbApellido" style="left: 552px; top: 120px; position: absolute"/>
                        <ui:staticText binding="#{OrdenMedica$BuscarPaciente.lblApellido}" id="lblApellido" style="left: 384px; top: 120px; position: absolute" text="Apellido"/>
                        <ui:textField binding="#{OrdenMedica$BuscarPaciente.txbNombre}" id="txbNombre" style="left: 552px; top: 96px; position: absolute"/>
                        <ui:button binding="#{OrdenMedica$BuscarPaciente.btnAceptar}" id="btnAceptar" style="left: 743px; top: 456px; position: absolute" text="Aceptar"/>
                        <ui:staticText binding="#{OrdenMedica$BuscarPaciente.lblNombre}" id="lblNombre" style="left: 384px; top: 96px; position: absolute" text="Nombre"/>
                        <ui:staticText binding="#{OrdenMedica$BuscarPaciente.lblTitulo}" id="lblTitulo" style="left: 624px; top: 24px; position: absolute" text="Buscar Paciente"/>
                        <ui:listbox binding="#{OrdenMedica$BuscarPaciente.lbxCoincidentes}" id="lbxCoincidentes"
                            items="#{OrdenMedica$BuscarPaciente.lbxCoincidentesDefaultOptions.options}" style="height: 120px; left: 408px; top: 264px; position: absolute; width: 360px"/>
                        <ui:button binding="#{OrdenMedica$BuscarPaciente.btnDetalles}" id="btnDetalles" style="left: 695px; top: 408px; position: absolute" text="Detalles"/>
                        <ui:staticText binding="#{OrdenMedica$BuscarPaciente.lblDNI}" id="lblDNI" style="left: 408px; top: 144px; position: absolute" text="DNI"/>
                        <ui:textField binding="#{OrdenMedica$BuscarPaciente.txbDNI}" id="txbDNI" style="left: 552px; top: 144px; position: absolute"/>
                        <ui:staticText binding="#{OrdenMedica$BuscarPaciente.lblCoincidentes}" id="lblCoincidentes"
                            style="left: 408px; top: 216px; position: absolute" text="Coincidentes"/>
                        <ui:button binding="#{OrdenMedica$BuscarPaciente.btnBuscar}" id="btnBuscar" style="position: absolute; left: 648px; top: 192px" text="Buscar"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
