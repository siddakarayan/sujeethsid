
var app=angular.module("Sign",[]);
app.controller('ctrl',function($scope,$http,$location,$window)
{
	alert("ha ha")
var url="http://"+$window.location.host+"/noidea";



$scope.Sign=function()
{
	
	$http.post(url+'/Sign/'+$scope.name).success(function(data)
			{
		alert("oiee")
		$log.log(data);
			});
	}
	})