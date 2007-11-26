<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Reglas$Reglas.page1}" id="page1">
            <ui:html binding="#{Reglas$Reglas.html1}" id="html1">
                <ui:head binding="#{Reglas$Reglas.head1}" id="head1">
                    <ui:link binding="#{Reglas$Reglas.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Reglas$Reglas.body1}" focus="form1:rbgConectorDeSubReglas1" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Reglas$Reglas.form1}" id="form1">
                        <ui:textField binding="#{Reglas$Reglas.txbValorLimitante2SubRegla1}" id="txbValorLimitante2SubRegla1" style="left: 504px; top: 960px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlLimitante2SubRegla1}" id="ddlLimitante2SubRegla1"
                            items="#{Reglas$Reglas.ddlLimitante2SubRegla1DefaultOptions.options}" style="left: 384px; top: 936px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblPrestaciones1}" id="lblPrestaciones1" style="left: 240px; top: 96px; position: absolute" text="Prestaciones"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlCumpleSubRegla1}" id="ddlCumpleSubRegla1"
                            items="#{Reglas$Reglas.ddlCumpleSubRegla1DefaultOptions.options}" style="left: 312px; top: 552px; position: absolute"/>
                        <ui:textField binding="#{Reglas$Reglas.txbValorLimitante1SubRegla1}" id="txbValorLimitante1SubRegla1" style="left: 432px; top: 768px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlNoCumpleSubRegla1}" id="ddlNoCumpleSubRegla1"
                            items="#{Reglas$Reglas.ddlNoCumpleSubRegla1DefaultOptions.options}" style="left: 552px; top: 552px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblDeLimitante2SubRegla1}" id="lblDeLimitante2SubRegla1"
                            style="left: 504px; top: 480px; position: absolute" text="de"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblEnLimitante1SubRegla1}" id="lblEnLimitante1SubRegla1"
                            style="left: 576px; top: 264px; position: absolute" text="en"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlBusquedaLimitante2SubRegla1}" id="ddlBusquedaLimitante2SubRegla1"
                            items="#{Reglas$Reglas.ddlBusquedaLimitante2SubRegla1DefaultOptions.options}" style="left: 528px; top: 480px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblEnLimitante2SubRegla1}" id="lblEnLimitante2SubRegla1"
                            style="left: 648px; top: 480px; position: absolute" text="en"/>
                        <ui:textField binding="#{Reglas$Reglas.txbTiempoDeBusquedaLimitante1SubRegla1}" id="txbTiempoDeBusquedaLimitante1SubRegla1" style="left: 624px; top: 264px; position: absolute; width: 72px"/>
                        <ui:button action="#{Reglas$Reglas.button1_action}" binding="#{Reglas$Reglas.btnSumarLimitante1SubRegla1}"
                            id="btnSumarLimitante1SubRegla1" style="left: 839px; top: 840px; position: absolute" text="Sumar"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante1SubRegla1}" id="ddlParametroDeBusquedaLimitante1SubRegla1"
                            items="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante1SubRegla1DefaultOptions.options}" style="left: 720px; top: 264px; position: absolute"/>
                        <ui:listbox binding="#{Reglas$Reglas.lbxLimitante1SubRegla1}" id="lbxLimitante1SubRegla1"
                            items="#{Reglas$Reglas.lbxLimitante1SubRegla1DefaultOptions.options}" style="height: 96px; left: 264px; top: 816px; position: absolute; width: 552px"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlNoCumpleSubRegla2}" id="ddlNoCumpleSubRegla2"
                            items="#{Reglas$Reglas.ddlNoCumpleSubRegla2DefaultOptions.options}" style="left: 552px; top: 1032px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlLimitante1SubRegla1}" id="ddlLimitante1SubRegla1"
                            items="#{Reglas$Reglas.ddlLimitante1SubRegla1DefaultOptions.options}" style="left: 312px; top: 744px; position: absolute"/>
                        <ui:button binding="#{Reglas$Reglas.btnEliminarLimitante1SubRegla1}" id="btnEliminarLimitante1SubRegla1"
                            style="left: 839px; top: 360px; position: absolute" text="Eliminar"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblLimitante1SubRegla1}" id="lblLimitante1SubRegla1"
                            style="left: 240px; top: 264px; position: absolute" text="Limitante"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlPlan1}" id="ddlPlan1" items="#{Reglas$Reglas.ddlPlan1DefaultOptions.options}" style="left: 624px; top: 48px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblDeLimitante1SubRegla1}" id="lblDeLimitante1SubRegla1"
                            style="left: 408px; top: 264px; position: absolute" text="de"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlLimitante2SubRegla2}" id="ddlLimitante2SubRegla2"
                            items="#{Reglas$Reglas.ddlLimitante2SubRegla2DefaultOptions.options}" style="left: 408px; top: 480px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblDeLimitante2SubRegla2}" id="lblDeLimitante2SubRegla2"
                            style="left: 504px; top: 936px; position: absolute" text="de"/>
                        <ui:button binding="#{Reglas$Reglas.btnModificarRegla1}" id="btnModificarRegla1" style="left: 863px; top: 1152px; position: absolute" text="Modificar"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblCumpleSubRegla1}" id="lblCumpleSubRegla1" style="left: 240px; top: 552px; position: absolute" text="Cumple"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblNoCumpleSubRegla1}" id="lblNoCumpleSubRegla1"
                            style="left: 480px; top: 552px; position: absolute" text="No Cumple"/>
                        <ui:radioButtonGroup binding="#{Reglas$Reglas.rbgConectorDeSubReglas1}" id="rbgConectorDeSubReglas1"
                            items="#{Reglas$Reglas.rbgConectorDeSubReglas1DefaultOptions.options}" onClick=""
                            selected="#{Reglas$Reglas.rbgConectorDeSubReglas1DefaultOptions.selectedValue}"
                            style="height: 48px; left: 264px; top: 624px; position: absolute; width: 288px" valueChangeListener="#{Reglas$Reglas.rbgConectorDeSubReglas1_processValueChange}"/>
                        <ui:textField binding="#{Reglas$Reglas.txbTiempoDeBusquedaLimitante1SubRegla2}" id="txbTiempoDeBusquedaLimitante1SubRegla2" style="left: 624px; top: 744px; position: absolute; width: 72px"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante1SubRegla2}" id="ddlParametroDeBusquedaLimitante1SubRegla2"
                            items="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante1SubRegla2DefaultOptions.options}" style="left: 720px; top: 744px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlBusquedaLimitante1SubRegla1}" id="ddlBusquedaLimitante1SubRegla1"
                            items="#{Reglas$Reglas.ddlBusquedaLimitante1SubRegla1DefaultOptions.options}" style="left: 456px; top: 744px; position: absolute"/>
                        <ui:listbox binding="#{Reglas$Reglas.lbxLimitante1SubRegla2}" id="lbxLimitante1SubRegla2"
                            items="#{Reglas$Reglas.lbxLimitante1SubRegla2DefaultOptions.options}" style="height: 96px; left: 240px; top: 336px; position: absolute; width: 576px"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblPlan1}" id="lblPlan1" style="left: 528px; top: 48px; position: absolute" text="Plan"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlBusquedaLimitante2SubRegla2}" id="ddlBusquedaLimitante2SubRegla2"
                            items="#{Reglas$Reglas.ddlBusquedaLimitante2SubRegla2DefaultOptions.options}" style="left: 528px; top: 936px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblDeLimitante1SubRegla2}" id="lblDeLimitante1SubRegla2"
                            style="left: 432px; top: 744px; position: absolute" text="de"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblCumpleSubRegla2}" id="lblCumpleSubRegla2"
                            style="left: 240px; top: 1032px; position: absolute" text="Cumple"/>
                        <ui:textField binding="#{Reglas$Reglas.txbValorLimitante2SubRegla2}" id="txbValorLimitante2SubRegla2" style="left: 504px; top: 504px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante2SubRegla1}" id="ddlParametroDeBusquedaLimitante2SubRegla1"
                            items="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante2SubRegla1DefaultOptions.options}" style="left: 792px; top: 480px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlComparadorSubRegla1}" id="ddlComparadorSubRegla1"
                            items="#{Reglas$Reglas.ddlComparadorSubRegla1DefaultOptions.options}" style="left: 240px; top: 480px; position: absolute"/>
                        <ui:textField binding="#{Reglas$Reglas.txbTiempoDeBusquedaLimitante2SubRegla1}" id="txbTiempoDeBusquedaLimitante2SubRegla1" style="left: 696px; top: 480px; position: absolute; width: 72px"/>
                        <ui:button action="#{Reglas$Reglas.btnEliminarRegla_action}" binding="#{Reglas$Reglas.btnEliminarRegla1}" id="btnEliminarRegla1"
                            onClick="" style="left: 767px; top: 1152px; position: absolute" text="Eliminar"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante2SubRegla2}" id="ddlParametroDeBusquedaLimitante2SubRegla2"
                            items="#{Reglas$Reglas.ddlParametroDeBusquedaLimitante2SubRegla2DefaultOptions.options}" style="left: 792px; top: 936px; position: absolute"/>
                        <ui:textField binding="#{Reglas$Reglas.txbTiempoDeBusquedaLimitante2SubRegla2}" id="txbTiempoDeBusquedaLimitante2SubRegla2" style="left: 696px; top: 936px; position: absolute; width: 72px"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlComparadorSubRegla2}" id="ddlComparadorSubRegla2"
                            items="#{Reglas$Reglas.ddlComparadorSubRegla2DefaultOptions.options}" style="left: 216px; top: 936px; position: absolute"/>
                        <ui:button action="#{Reglas$Reglas.btnSumarLimitante1SubRegla1_action}" binding="#{Reglas$Reglas.btnSumarLimitante1SubRegla2}"
                            id="btnSumarLimitante1SubRegla2" style="left: 839px; top: 336px; position: absolute" text="Sumar"/>
                        <ui:listbox binding="#{Reglas$Reglas.lbxPrestaciones1}" id="lbxPrestaciones1"
                            items="#{Reglas$Reglas.lbxPrestaciones1DefaultOptions.options}" style="height: 72px; left: 240px; top: 120px; position: absolute; width: 552px"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlLimitante1SubRegla2}" id="ddlLimitante1SubRegla2"
                            items="#{Reglas$Reglas.ddlLimitante1SubRegla2DefaultOptions.options}" style="left: 312px; top: 264px; position: absolute"/>
                        <ui:textField binding="#{Reglas$Reglas.txbValorLimitante1SubRegla2}" id="txbValorLimitante1SubRegla2" style="left: 432px; top: 288px; position: absolute"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlCumpleSubRegla2}" id="ddlCumpleSubRegla2"
                            items="#{Reglas$Reglas.ddlCumpleSubRegla2DefaultOptions.options}" style="left: 312px; top: 1032px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblLimitante2SubRegla1}" id="lblLimitante2SubRegla1"
                            style="left: 336px; top: 480px; position: absolute" text="Limitante"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblEnLimitante1SubRegla2}" id="lblEnLimitante1SubRegla2"
                            style="left: 576px; top: 744px; position: absolute" text="en"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblLimitante1SubRegla2}" id="lblLimitante1SubRegla2"
                            style="left: 240px; top: 744px; position: absolute" text="Limitante"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblNoCumpleSubRegla2}" id="lblNoCumpleSubRegla2"
                            style="left: 480px; top: 1032px; position: absolute" text="No Cumple"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblEnLimitante2SubRegla2}" id="lblEnLimitante2SubRegla2"
                            style="left: 648px; top: 936px; position: absolute" text="en"/>
                        <ui:button binding="#{Reglas$Reglas.btnEliminarLimitante1SubRegla2}" id="btnEliminarLimitante1SubRegla2"
                            style="left: 839px; top: 864px; position: absolute" text="Eliminar"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblTitulo1}" id="lblTitulo1" style="left: 600px; top: 0px; position: absolute" text="Reglas"/>
                        <ui:dropDown binding="#{Reglas$Reglas.ddlBusquedaLimitante1SubRegla2}" id="ddlBusquedaLimitante1SubRegla2"
                            items="#{Reglas$Reglas.ddlBusquedaLimitante1SubRegla2DefaultOptions.options}" style="left: 456px; top: 264px; position: absolute"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblRegla1}" id="lblRegla1" style="left: 240px; top: 216px; position: absolute" text="Regla"/>
                        <ui:staticText binding="#{Reglas$Reglas.lblLimitante2SubRegla2}" id="lblLimitante2SubRegla2"
                            style="left: 312px; top: 936px; position: absolute" text="Limitante"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
