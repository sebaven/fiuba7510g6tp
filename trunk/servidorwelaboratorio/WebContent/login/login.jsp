<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clinica</title>
</head>
<body>



<STYLE>
<!--
font.loginhead {
font-family: Arial,Helvetica,sans-serif;
font-size:12pt; font-weight: 600; color: #000000;
}
font.loginform {
font-family: Arial,Helvetica,sans-serif;
font-size:10pt; font-weight: 600; color: #ffffff;
}

#side-right500 {
    position: absolute; 
    top: 50%; 
    left: 50%; 
    margin-top: -80px; 
    margin-left: -80px; 
}
 
-->
</STYLE>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laboratorio</title>
</head>
<body>
<jsp:include flush="true" page="../menu/navbar.jsp"></jsp:include>

<div id="side-right500">
<form action="loginData.jsp" method="post">
<TABLE BGCOLOR=#990022 BORDER=0 CELLPADDING=5 CELLSPACING=0>
<TR><TD ALIGN=right >
<FONT CLASS="loginform">
* Login Name:
</FONT>
</TD><TD ALIGN=left>
<FONT CLASS="loginform">
<INPUT TYPE=text NAME="nombre" SIZE=10>
</FONT>
</TD></TR>
<TR><TD ALIGN=right>
<FONT CLASS="loginform">
* Password:
</FONT>
</TD><TD ALIGN=left>
<FONT CLASS="loginform">
<INPUT TYPE=password NAME="password" SIZE=10 >
</FONT>
</TD></TR>
<TR><TD COLSPAN=2 ALIGN=center>
<FONT CLASS="loginform">
<input type="submit" name="login" value="login">
</FONT>
</TD></TR>
</TABLE>
</FORM>
</div>



</body>
</html>