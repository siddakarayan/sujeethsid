
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="utf-8">
  
<style>
  body {
  background-image: url("resources/images/p8.jpg");
  background-repeat;
  }




#formDiv
{
	width:1080px;
	margin:0px auto;
	margin-top:20px;
	
}


</style>

</head>
<body>
<form:form method="POST" action="signupenter" commandName="user">
<div id=formDiv>
<form data-toggle="validator" role="form">
<div class="col-xs-3">
  


  <div class="form-group">

    <form:label path="username"  >Name</form:label>
  
    <form:input class="form-control" path="username"  required="true"></form:input>
  </div>
  
  <div class="form-group">
    <form:label path="email" >email</form:label>
    <form:input class="form-control" path="email" required="true"></form:input>
    <div class="help-block with-errors"></div>
  </div>
  <div class="form-group">
    <form:label path="password">password</form:label>   
    <form:input class="form-control" path="password"  required="true"></form:input>
   <div class="help-block">Minimum of 6 characters</div>
   </div>
   
    
    <div class="form-group">
    <form:label path="address" >address</form:label>
    <form:input class="form-control" path="address" required="true"></form:input>
    
  </div>
  
  <div class="form-group">
    <form:label path="state" >state</form:label>
    <form:input class="form-control" path="state" required="true"></form:input>
    
  </div>
  
  <div class="form-group">
    <form:label path="city" >city</form:label>
    <form:input class="form-control" path="city" required="true"></form:input>
  </div>
  
   <div class="form-group">
    <form:label path="mobile" >mobile</form:label>
    <form:input class="form-control" path="mobile" required="true"></form:input>
    
  </div>
  
  <div class="col-sm-offset-2 col-sm-10"></div>
  <div class="form-group">
  
    <form:button type="submit" class="btn btn-primary">Submit</form:button>
    <form:button type="reset" class="btn btn-primary">Reset</form:button>
  </div>

        </div>
        </div>
</form>
</div>
</form:form>




