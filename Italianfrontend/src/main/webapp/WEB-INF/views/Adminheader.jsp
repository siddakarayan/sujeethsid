<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LAMBORGHINI CARS</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LAMBORGHINI CARS</a>
    </div>
    <c:if test="${sessionScope.email eq null }">
     
  <ul class="nav navbar-nav">
      <li class="active"><a href="Adhome"><span class="glyphicon glyphicon-home"></span>Home</a></li>
       
     </ul>  
     </c:if>
    <ul class="nav navbar-nav navbar-right">
    
      <li><a href="Addproducts">ADD</a></li>
       <li><a href="Productlist">VIEW</a></li>
       
      <li><a href="home"><span class="glyphicon glyphicon-log-out"></span> logout</a></li>
    </ul>
    
    <c:if test="${sessionScope.email ne null }">
     <h1 style="color:blue">Welcome,${sessionScope.username}</h1>
  
    </c:if>
  </div>
</nav>

</body>
</html>