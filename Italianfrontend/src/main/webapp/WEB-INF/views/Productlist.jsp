<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ include file="Adminheader.jsp" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
body {
   background-color:orange;
    
    background-repeat;
}
</style>
</head>
<body>
<H1> List of Products</H1>
	<!--  use JSTL tags -->
	<!--  iterate list of objects -->
	<!--  For each book b in books -->
	<table border="0" class="table table-striped table-hover">
		<tr>
			<th>PRODUCTID</th>
			<th>PRODUCTNAME</th>
			<th>PRODUCTPRICE</th>
			<th>PRODUCTDETAILS</th>
			<th>PRODUCTCATEGORY</th>
			
			<th>Edit/Delete</th>
		</tr>
		<!--  for Each book b in books -->
		<c:forEach items="${lobj}" var="b">
		<tr>
		<td>${ b.productid}</td>
		<td>${ b.productname}</td>
		<td>${ b.productprice}</td>
		<td>${ b.productdetails}</td>
		<td>${ b.productcategory}</td>
		
	   <%-- <td><a href="getProductsByid/${b.productid}" >${b.productid}</a></td><td>${b.productname}</td> --%>
        <td>
		<a href="admin/product/editProduct/${b.productid }"><span class="glyphicon glyphicon-scissors"></span></a>
	    <a href="admin/product/delete/${b.productid }"><span class="glyphicon glyphicon-fire"></span></a>
		</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
