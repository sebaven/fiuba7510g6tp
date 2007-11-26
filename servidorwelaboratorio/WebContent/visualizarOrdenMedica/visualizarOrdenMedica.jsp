<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="ar.com.tplaboratorio.serviciosaplicacion.ServiciosAplicacionFactory"%>
<%@page import="ar.com.tplaboratorio.serviciosaplicacion.IVisualizarOrdenMedicaService"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="ar.com.tplaboratorio.negocio.OrdenMedicaLab"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<jsp:include flush="true" page="../menu/navbar.jsp"></jsp:include>
<%
IVisualizarOrdenMedicaService visualizarService= ServiciosAplicacionFactory.getInstance().getVisualizarOrdenMedicaService();
Collection ordenes=visualizarService.getOrdenesMedicas();
%>
<center>Ordenes</center>
<center>
<form action="enviarOrdnesLaboratorio" method="get">
	<table>
	<thead>
	<tr><th>Nro orden</th> <th>Medico</th><th>Paciente</th><th>Enviar resultado </th></tr>
	
	</thead>
	<tbody>
	<%
	 for (Iterator it=ordenes.iterator();it.hasNext();){
	 	OrdenMedicaLab orden=(OrdenMedicaLab)it.next();	 
	%>
	<tr><td><input type="submit" name="enviar" value="<%=orden.getNroOrden() %>" ></td> <td><%=orden.getMedico() %></td> <td><%=orden.getPaciente()%></td></tr>
	<%
	 }
	%>
	</tbody>
	
	</table>
	
</form>
</center>
</body>
</html>