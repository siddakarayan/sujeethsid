
var app=angular.module("Sign",[]);
app.controller('ctrl',function($scope,$http,$location,$window,$log)
{
var url="http://"+$window.location.host+"/myloss";


alert("ha ha")

$scope.Sign=function()
{
	alert("Hy sujeeth")
	$http.post(url+'/Sign/'+$scope.name+'/'+$scope.email+'/'+$scope.password+'/'+$scope.address+'/'+$scope.state+'/'+$scope.city+'/'+$scope.mobile+'/').success(function(data)
			{
		alert("oiee");
		$log.log(data);
			});
	}
	})
