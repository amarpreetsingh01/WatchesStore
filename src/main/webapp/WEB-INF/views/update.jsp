<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" %>
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
	ArrayList<String> categoryList=new ArrayList();
	categoryList.add("Men Watch");
	categoryList.add("Sports Watch");
	categoryList.add("Women Watch");
	categoryList.add("Digital Watch");
	categoryList.add("Kids Watch");
	request.setAttribute("categoryList",categoryList);
%>
<form:form method="POST" action="updateproductdb" commandName="product">
   <table>
   <tr>
        <td><form:label path="id">Id</form:label></td>
        <td><form:input path="id" value="${product.id}"  readonly="true" /></td>
    </tr>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" value="${product.name}" /></td>
    </tr>
    <tr>
        <td><form:label path="category">Category</form:label></td>
        <td><form:select path="category" items="${categoryList}" value="${product.category}">
        	</form:select>
        </td>
    </tr>
    <tr>
        <td><form:label path="price">Price</form:label></td>
        <td><form:input path="price" value="${product.price}" /></td>
    </tr>
    <tr>
        <td><form:label path="description">Description</form:label></td>
        <td><form:input path="description" value="${product.description}" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="update"/>
        </td>
    </tr>

</body>
</table>
</form:form>
 
</html>