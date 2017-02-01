<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
  <title>Watches Store</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script language="javascript" type="text/javascript">
 function formSubmit()
 {
    document.getElementById("logout").submit();
}
</script>
  
  
</head>
<body>

<nav class="navbar navbar-inverse">
 <div class="container">
                <c:url value="/perform_logout" var="logout" />
                <form action="${logout}" method="post" id="logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>                
            <div class="container-fluid">
    <div class="navbar-header">
          </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="contactus">ContactUs</a></li>
      <li><a href="aboutus">AboutUs</a></li>
      <li><a href="showallproducts">show all products</a></li>
      <c:if test="${pageContext.request.userPrincipal.name=='amarpreet'}">
      	<li><a href="addaproduct">Add a product</a></li>
       
      </c:if>    
       
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <c:if
    test="${pageContext.request.userPrincipal.name!=null}">
   <font color="pink"> <li> welcome :${pageContext.request.userPrincipal.name}</li></font>
    <li> <a href="javascript:formSubmit()">Logout</a></li>
    	<security:authentication var="user" property="principal.authorities" />
					<security:authorize var="loggedIn" access="isAuthenticated()">
					<!--<security:authorize access="hasRole('ADMIN')">
					 	<li>Admin</li>
					</security:authorize>
					<security:authorize access="hasRole('USER')">
    					<li>User</li>
    				</security:authorize>-->		
    				</security:authorize>
    
    </c:if>
      <li><a href="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   </ul>
  </div>
  </nav>
  </body>
  </html>