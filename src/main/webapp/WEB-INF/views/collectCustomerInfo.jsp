<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.error {color:	#FF0000;}

</style>
</head>
<body bgcolor="#FFDAB9">

<h1>COLLECT CUSTOMER INFORMATION</h1>
<form:form action="orderConfirm" method="post" commandName="customer">
 <table>
     <tr>
        <td><form:label path="custName">Customer name</form:label></td>
        <td><form:input path="custName" /></td>
        <td><form:errors path="custName" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="contactNo">contact no</form:label></td>
        <td><form:input path="contactNo" /></td>
        <td><form:errors path="contactNo" cssClass="error" /></td>
       
    </tr>
       <tr>
        <td><form:label path="billingaddress">Billing address</form:label></td>
        <td><form:input path="billingaddress" /></td>
        <td><form:errors path="billingaddress" cssClass="error" /></td>
    </tr>
       <tr>
        <td><form:label path="shippingaddress">shipping address</form:label></td>
        <td><form:input path="shippingaddress" /></td>
        <td><form:errors path="shippingaddress" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="submit"/>
        </td>
    </tr>
    
</table>
</form:form>
</body>
</html>