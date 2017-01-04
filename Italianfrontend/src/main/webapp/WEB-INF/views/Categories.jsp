<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    <%@ include file="header.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
  <style>
   body {
   background-color: orange;
    background-repeat;
}
</style>
</head>
<body>

<table align="centre" border="1">
 <tr>
 <th>PRODUCTNAME</th>
 <th>PRODUCTPRICE</th>
 <th>PRODUCTDETAILS</th>
 <th>PRODUCTCATEGORY</th>
 <th>SHOW</th>
  </tr>

				
					<c:forEach items="${prod}" var="b">
					 <tr>
   
    <td>${ b.productname}</td>
		<td>${ b.productprice}</td>
		<td>${ b.productdetails}</td>
		<td>${ b.productcategory}</td>
		<td><a href="view/${b.getProductid()}"><span class="glyphicon glyphicon-fire"></span></a></td>
				</c:forEach>

</table>
   </body>
</html>

