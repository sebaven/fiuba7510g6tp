<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Medicos$Medicos.page1}" id="page1">
            <ui:html binding="#{Medicos$Medicos.html1}" id="html1">
                <ui:head binding="#{Medicos$Medicos.head1}" id="head1">
                    <ui:link binding="#{Medicos$Medicos.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Medicos$Medicos.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Medicos$Medicos.form1}" id="form1">
                        <ui:staticText binding="#{Medicos$Medicos.lblTitulo}" id="lblTitulo" style="left: 576px; top: 96px; position: absolute" text="Medicos"/>
                        <ui:listbox binding="#{Medicos$Medicos.lbxMedicos}" id="lbxMedicos" items="#{SessionBean1.medicos}" style="left: 336px; top: 168px; position: absolute; width: 528px"/>
                        <ui:button binding="#{Medicos$Medicos.btnAnadir}" id="btnAnadir" style="position: absolute; left: 720px; top: 480px" text="Añadir"/>
                        <ui:button binding="#{Medicos$Medicos.btnEditar}" id="btnEditar" style="left: 791px; top: 480px; position: absolute" text="Editar"/>
                        <ui:button binding="#{Medicos$Medicos.btnEliminar}" id="btnEliminar" style="position: absolute; left: 864px; top: 480px" text="Eliminar"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
