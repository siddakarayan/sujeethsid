<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/admin/product/editProductbyid/" var="url"></c:url> 
	<form:form method="post" action="${url}" commandName="editproductobj">
		<table>
		<tr>
			<td><form:label path="productid">Product id</form:label></td>
			<td><form:input path="productid" disabled="true"/>
			<form:hidden path="productid" /></td>
        </tr>
        <tr>
        <td><form:label path="productname">Product name</form:label>  </td>
        <td><form:input path="productname"></form:input></td>
	    </tr>
	    
	    
	    <tr>
        <td><form:label path="productprice">Product price</form:label>  </td>
        <td><form:input path="productprice"></form:input></td>
	    </tr>
	    
	     <tr>
        <td><form:label path="productdetails">Product details</form:label>  </td>
        <td><form:input path="productdetails"></form:input></td>
	    </tr>
	    
	     <tr>
	    <td colspan="2"><input type="submit" value="edit"></td>
	    </tr>
		</table>
	</form:form>
</body>
</html>