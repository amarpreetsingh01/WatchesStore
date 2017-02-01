
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ include file="header.jsp" %>--%> 
<html>
<head>
<title>All products</title><meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 </head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="showallaproducts">Products</a></li>
      
    </ul>
  </div>
</nav>


<table border=2>
<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Category</th>
		<th>Description</th>
	</tr>
<c:forEach  var="p" items="${prodlist}" >
	
	<tr>
	<td>${p.id}</td>
	<td>${p.name}</td>			
	<td>${p.price}</td>
	<td>${p.category}</td>
	<td>${p.description}</td>
	<td><img src="resources/${p.id}.jpg"/></td>
	<c:if test="${pageContext.request.userPrincipal.name!='amarpreet'}">
		<td><a href="cart?pid=${p.id}"><button type="button" class="btn btn-info">Shop It</button></a></td>
	</c:if>
	 <c:if test="${pageContext.request.userPrincipal.name=='amarpreet'}">	
			<td><a href="update?pid=${p.id}"><button type="button" class="btn btn-success">update</button></a></td>
			<td><a href="delete?pid=${p.id}"><button type="button" class="btn btn-danger">delete</button></a></td>
	</c:if>
</tr>
</c:forEach>
</table>
</body>
</html>