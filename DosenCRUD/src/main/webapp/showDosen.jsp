<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabel Dosen</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
	<!-- As a heading -->
	<nav class="navbar navbar-dark bg-success">
		<div class="container">
			<a class="navbar-brand"> Database Dosen </a> 
			<a class="btn btn-primary" href="createDosen.jsp" role="button">Create</a>
		</div>
	</nav>
	<div class="container">
	<table class="table table-striped">
		<thead>
		<tr>
			<th>Kode Dosen</th>
			<th>Nama</th>
			<th colspan="2">Action</th>
		</tr>
		</thead>
		<tbody class="table-group-divider">
		<c:forEach items="${dosens}" var="d">
			<tr>
				<td><c:out value="${d.getKodeDsn()}" /></td>
				<td><c:out value="${d.getNameDsn()}" /></td>
				<td><a href='showUpdateDosen?kodeDsn=${d.getKodeDsn()}'><span
						class="badge text-bg-warning">Update</span></a></td>
				<td><a href="deleteDosen?kodeDsn=${d.getKodeDsn()}" 
				onclick="return checkDelete()"><span
						class="badge text-bg-danger">Delete</span></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	
	
	<script>
		function checkDelete(){
			return confirm('Mau Hapus Data Ini ');
		}
	</script>
	
	

</body>
</html>