<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{OrdenMedica$AñadirPrestaciones.page1}" id="page1">
            <ui:html binding="#{OrdenMedica$AñadirPrestaciones.html1}" id="html1">
                <ui:head binding="#{OrdenMedica$AñadirPrestaciones.head1}" id="head1">
                    <ui:link binding="#{OrdenMedica$AñadirPrestaciones.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{OrdenMedica$AñadirPrestaciones.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{OrdenMedica$AñadirPrestaciones.form1}" id="form1">
                        <ui:staticText binding="#{OrdenMedica$AñadirPrestaciones.lblTitulo}" id="lblTitulo" style="position: absolute; left: 528px; top: 48px" text="Añadir Prestaciones"/>
                        <ui:staticText binding="#{OrdenMedica$AñadirPrestaciones.lblPrestaciones}" id="lblPrestaciones"
                            style="position: absolute; left: 360px; top: 96px" text="Prestaciones"/>
                        <ui:listbox binding="#{OrdenMedica$AñadirPrestaciones.lbxPrestaciones}" id="lbxPrestaciones"
                            items="#{OrdenMedica$AñadirPrestaciones.lbxPrestacionesDefaultOptions.options}" style="left: 384px; top: 144px; position: absolute; width: 384px"/>
                        <ui:button binding="#{OrdenMedica$AñadirPrestaciones.btnAgregar}" id="btnAgregar" style="position: absolute; left: 696px; top: 384px" text="Agregar a la orden"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
