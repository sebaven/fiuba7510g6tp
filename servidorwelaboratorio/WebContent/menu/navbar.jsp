<%@ page import ="java.util.*" %>
<%!
	class Tab {
		String tabname;
		String location;
		Tab (String name, String value) {
			this.tabname = name;
			this.location = value;
		}
	}
%>
<%
	Vector leftnavbar = new Vector();
	Vector rightnavbar = new Vector();
	leftnavbar.add(new Tab("Main", ""));
	rightnavbar.add(new Tab("Logout", "logout.jsp"));
	leftnavbar.add(new Tab("Registrar Resultado Orden", "../registrarresultadoordenmedica/registrarresultadoordenmedica.jsp"));
	rightnavbar.add(new Tab("Visualizar Ordenes","../visualizarOrdenMedica/visualizarOrdenMedica.jsp"));
	
%>
<STYLE>
<!-
td.navbar {
background-color: #990022;
margin: 1px; padding: 1px; border: 1px;
}
font.navtext {
font-family: arial,helvetica,sans-serif;
font-weight: 600; text-decoration: none;
font-size: 10pt; color: #000000;
}
-->
</STYLE>
<TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0>
<TR>
<TD ALIGN=LEFT CLASS="navbar">
<TABLE CELLPADDING=3 CELLSPACING=2 BORDER=0>
<TR>
<%
	Enumeration lefttabs = leftnavbar.elements();
	while (lefttabs.hasMoreElements()) {
	Tab current = (Tab)lefttabs.nextElement();
%>
<TD>
<A HREF="<%=current.location%>">
<FONT CLASS="navtext">
<%=current.tabname%>
</FONT>
</A>
</TD>
<%
}
%>
</TR>
</TABLE>
</TD>
<TD ALIGN=RIGHT CLASS="navbar">
<TABLE CELLPADDING=5 CELLSPACING=2 BORDER=0>
<TR>
<%
	Enumeration righttabs = rightnavbar.elements();
	while (righttabs.hasMoreElements()) {
	Tab current = (Tab)righttabs.nextElement();
%>
<TD>
<A HREF="<%=current.location%>">
<FONT CLASS="navtext">
<%=current.tabname%>
</FONT>
</A>
</TD>
<%
}
%>
</TR>
</TABLE>
</TD>
</TR>
</TABLE>
<BR><BR>