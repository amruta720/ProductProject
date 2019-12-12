<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>

<style>
table{
border:2px solid black;
border-radius:30px;
padding:100px;

}
</style>
<body background="shopping.jpg">

  

<form action="ProdController" method="post">


<table align="center" style="width:40%" style="height:100%">

<tr>
<td><b>ProdNo</b><input type="text" name="pno"></td>
</tr>
<tr>
<td><b>ProdName</b><input type="text" name="pn"></td>
</tr>
<tr>
<td><b>Price</b><input type="text" name="pr"></td>
</tr>
<tr>
<td><b>Quantity	</b><input type="text" name="qt"></td>
</tr>
<tr>
<td><input type="submit" value="submit" name="save"></td>
</tr>
</table>

</form>
</body>
</html>