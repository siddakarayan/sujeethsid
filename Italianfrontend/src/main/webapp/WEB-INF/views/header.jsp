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
    <ul class="nav navbar-nav">
      <li class="active"><a href="home"><span class="glyphicon glyphicon-home"></span>Home</a></li>
       
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="category">Categories<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Categories?cat=CARS">CARS</a></li>
          <li><a href="Categories?cat=ACCESSORIES">ACCESSORIES</a></li>
           </ul>
      </li>
         
      
      <li><a href="AboutUs">ABOUT US</a></li>
    </ul>  
    
    <c:if test="${sessionScope.email eq null }">
    
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="signup"><span class="glyphicon glyphicon-user"></span> signUp</a></li>
      
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> login</a></li>
    </ul>
      
    </c:if>
  
  <c:if test="${sessionScope.email ne null }">
   
   <h1 style="color:blue">Welcome,${sessionScope.username}</h1>
   
  <ul class="nav navbar-nav navbar-right">

  <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> logout</a></li>
   </ul>
    </c:if>
    </div>
</nav>
</body>
</html>