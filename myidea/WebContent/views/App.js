var app=angular.module('Sign',['ngRoute']); 

app.controller('ctrl',function($scope,$http,$route,$location,$window)
		
		{
var url="http://"+$window.location.host+"/myloss";
        
         alert("welcome buddy");

	           $scope.Login=function()
	{
         alert("get ready");
	           
               $http.post(url+'/Login/'+$scope.email+'/'+$scope.password).success(function(data)
	{
	console.log("U R inside");
       
	     alert("U U OUT");
	     
	     
	    
	   {
		   
		   $window.location.href = "http://localhost:8090/myidea/Home.html";
	   }
       
         console.log(data);
	      	
      }).error(function()
	{
			   $window.alert("wrong username and password");
	});
	}
	
	
    
	           
	           $scope.Sign=function()
	{
     alert("before post");
	            $http.post(url+'/Sign/'+$scope.name+'/'+$scope.email+'/'+$scope.password+'/'+$scope.address+'/'+$scope.state+'/'+$scope.city+'/'+$scope.mobile).success(function(data)
	{
     alert("after post");
                $location.path('/Login');
                $scope.Login=function()
    {
	            $log.log(data);
    }			
	})
	}
	});
	  

          app.config(function($routeProvider){
		  $routeProvider.when("/Login",{templateUrl: "Login.html"})
		  $routeProvider.when("/Sign",{templateUrl:"Sign.html"})
		  $routeProvider.when("/Home",{templateUrl: "Home.html"});
	});

		
	    
	
	
	
		

	


	
	
	
		