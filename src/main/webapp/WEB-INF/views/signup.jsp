<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign up</title>
<style type="text/css">
  .error { color:red; }    
 </style> 
</head>
<body bgcolor="yellow">
<h1>sign up</h1>
 <font size = 14 color="#FFFF00"></font>
<body>

<form:form method="POST" action="register" commandName="authentication">
 <table>
     <tr>
        <td><form:label path="username">UserName</form:label></td>
        <td><form:input path="username" /></td>
        <td><form:errors path="username" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" />
        <td><form:errors path="email" cssClass="error" /></td>
        </td>
       
    </tr>
       <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password" /></td>
        <td><form:errors path="password" cssClass="error" /></td>
    </tr>
       <tr>
        <td><form:label path="contact">Contact</form:label></td>
        <td><form:input path="contact" /></td>
        <td><form:errors path="contact" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>