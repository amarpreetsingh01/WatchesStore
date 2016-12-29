<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addaproduct</title>
<style type="text/css">
  .error { color:red; }    
 </style> 
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
<form:form method="POST" action="addproductdb" commandName="product" enctype="multipart/form-data">
   <table>
     <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
        <td><form:errors path="name" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="category">Category</form:label></td>
        <td><form:select path="category" items="${categoryList}">
        	</form:select>
        </td>
        <td><form:errors path="category" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="price">Price</form:label></td>
        <td><form:input path="price" /></td>
        <td><form:errors path="price" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="description">Decription</form:label></td>
        <td><form:input path="description" /></td>
        <td><form:errors path="description" cssClass="error" /></td>
    </tr>
       <tr>
        <td><form:label path="">Image</form:label></td>
        <td><form:input type="file"  path="image" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="ADD"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>