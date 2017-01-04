<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ include file="Adminheader.jsp" %>  
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Products</title>
 <style>
   body {
   background-image: url("resources/images/p4.jpg");
}

#formDiv
{
	width:380px;
	margin:0px auto;
	margin-top:20px;
	
}

  </style>
 
</head>
<body>
<c:url value="/admin/product/addProducts" var="url"></c:url> 
	<form:form method="POST" action="addproduct" commandName="productFormObj" enctype="multipart/form-data">
   
		<table>
		
		
        <tr>
        <td><form:label path="productname">Name</form:label>  
        <td><form:input path="productname"></form:input>
        <form:errors path="productname"></form:errors>
       </td>
	    </tr>
	     <tr>
        <td><form:label path="productdetails">Details</form:label>  
        <td><form:input path="productdetails"></form:input>
        <form:errors path="productdetails"></form:errors>
        </td>
	    </tr>

	     <tr>
        <td><form:label path="productprice">Price</form:label>  
        <td><form:input path="productprice"></form:input>
        
	    </tr>
	     <tr>
        <td><form:label path="productcategory">Category</form:label>  
        <td><form:input path="productcategory"></form:input>
        </td>
        <td>
        <input type="file" value="upload" name="files">
        </td>
	  <tr>
	    <td colspan="2"><input type="submit" value="AddProduct"></td>
	    
	    </tr>
		</table>
	</form:form>
</body>
</html>