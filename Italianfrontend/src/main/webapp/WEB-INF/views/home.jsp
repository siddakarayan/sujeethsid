<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <%@ page isELIgnored="false" %> 
    <%@ include file="header.jsp" %>  
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LAMBORGHINI CARS</title>
<meta charset="utf-8">
  
  <style>
   body {
   background-color:black;
    
    background-repeat;
}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
   width:800px;
height:400px;
      margin: auto;
  }
  </style>
</head>
<body>
    

<div class="container">
   
  <h1 style="color:yellow;"><em>LAMBORGHINI CARS</em></h1>
  <p style="color:red;"><em>Looking for a Lambo?</em></p>
</div>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
       <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<c:url value="/resources/images/lam1.jpg"/>"/>
      </div>

      <div class="item">
         <img src="<c:url value="/resources/images/lam2.jpg"/>"/>
      </div>
    
      <div class="item">
         <img src="<c:url value="/resources/images/lam3.jpg"/>"/>
      </div>

      <div class="item">
         <img src="<c:url value="/resources/images/lam4.jpg"/>"/>
      </div>
    <div class="item">
         <img src="<c:url value="/resources/images/lam5.jpg"/>"/>
      </div>    
     </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>





    
        <hr>

        

    
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>


<div class="container-fluid bg-grey">
  <h2 class="text-center"  style="color:white">FEEDBACK</h2>
  <div class="row">
    <div class="col-sm-5">
      <p style="color:green">Contact us and we'll get back to you within 8 hours.</p>
      <p style="color:green"><span class="glyphicon glyphicon-map-marker"></span> chennai,tamilnadu</p>
      <p style="color:green"><span class="glyphicon glyphicon-phone"></span> +91 9791125821</p>
      <p style="color:green"><span class="glyphicon glyphicon-envelope"></span> sujeethrheen@gmail.com</p>
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>