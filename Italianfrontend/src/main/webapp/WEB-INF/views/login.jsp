 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>LOGIN FORM</title>
 
  <style>
   body {
   background-image: url("resources/images/p9.jpg");
    background-repeat;
}

.text1{
padding-left: 470px;
padding-right: 470px;

}
.text2{

padding-left: 470px;
padding-right: 470px;
margin-bottom: 21px;
margin-top: 10px;


}
.hea1{
margin-top: -95px;
margin-left: 380px;
}

.hea2{

margin-left: 380px;
margin-top: 10px;
margin-bottom: 10px;
padding-top: -12px;

}

.bu1{
margin-left: 769px;
}

.whole{
margin-bottom: 30px;
margin-top: 114px;

}

  </style>

</head>

<body>



 <form:form method="POST" action="loginenter" commandName="user">
 
  
<div class="whole">
    
    
<div class="text1">
 <input class="form-control"  type="text" name="email"   required="true"/>
    </div>
  
 
 <div class="text2">

   <input class="form-control"  type="password" name="password" required="true"/>
    
   
  </div>
  <div class="hea1">
  <h5>EMAIL</h5>
  
  </div>
  <br>
  <div class="hea2">
  <h5>PASSWORD</h5>
  </div>
  
  
  <div class="bu1">
      <form:button type="login" class="btn btn-primary">Login</form:button>
    </div>
  </div>
</form:form>
</body>
</html>



