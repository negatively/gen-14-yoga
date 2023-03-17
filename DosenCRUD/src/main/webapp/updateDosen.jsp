<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data Dosen</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-success">
		<div class="container">
			<a class="navbar-brand"> Update Data Dosen </a>
		</div>
	</nav>

	<div class="container">
	<form action="updateDosen" method="post" id="form" onsubmit="return validateForm()">
		<div class="mb-3 mt-3">
			<label for="kode" class="form-label"><b>Kode Dosen</b></label>
			<input type="text" class="form-control"
				id="inputKode" name="kodeDsn" value="${dosen.getKodeDsn()}" readonly>
		</div>
		<div class="mb-3">
			<label for="name" class="form-label"><b>Nama Dosen</b></label>
			<input type="text" class="form-control" 
				id="inputName" name="nameDsn" value="${dosen.getNameDsn()}" required>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
	<script>
		const name = document.getElementById('inputName');
		const form = document.getElementById('form');
		
	</script>

</body>
</html>