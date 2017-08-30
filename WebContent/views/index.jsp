<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bee</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	function getData(){
		$.ajax({
			url: "../GetDataServlet",
			type: "POST",
			success: function(data){
				$('#data').html(data);
			}
		});
	}
	
	function createData(){
		$.ajax({
			url: "../CreateServlet",
			type: "POST",
			success: function(data){
				$('#data').html(data);
			}
		});
	}
	
	function damage(){
		$.ajax({
			url: "../DamageServlet",
			type: "POST",
			success: function(data){
				$('#data').html(data);
			}
		});
	}
	
	function save(){
		$.ajax({
			url: "../SaveServlet",
			type: "POST",
			success: function(data){
				$('#data').html(data);
			}
		});
	}
</script>
</head>
<body>
		<input type="button" onClick="getData()" value="Get data">
		<input type="button" onClick="createData()" value="Create">
		<input type="button" onClick="damage()" value="Damage">
		<input type="button" onClick="save()" value="Save">		
	<div id="data"></div>
</body>
</html>