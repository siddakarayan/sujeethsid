<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html ">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<form:form action="Show" commandName="showObj">

  PRODUCTNAME : ${showObj.productname}  <br>
 
  PRODUCTPRICE:${showObj.productprice } <br>
  
  PRODUCTDETAILS :${showObj.productdetails} <br>

<img src="<c:url value="/resources/Pdimg/${showObj.getProductid()}.jpg"/>">
</form:form>
</body>
</html>