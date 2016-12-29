<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<table border=2>
<tr></tr>
<c:forEach  var="p" items="${prodlist}" >
	<tr>
	<td>${p.id}</td>
	<td>${p.name}</td>			
	<td>${p.price}</td>
	<td>${p.category}</td>
	<td>${p.description}</td>
	<td><img src="<c:url value='/resources/${p.id}.jpg}'/>" width="200" height="200"></td>
	<td><a href="update?pid=${p.id}"><button type="button" class="btn btn-success">update</button></a></td>
	<td><a href="delete?pid=${p.id}"><button type="button" class="btn btn-danger">delete</button></a></td>

</tr>
</c:forEach>
</table>
</body>
</html>