<html>
<head>
  <meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body bgcolor="yellow">
<h1>Mens Rolex Watch</h1>
 <font size = 14 color="#FFFF00"></font>
  <div class="row">
    <div class="col-md-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="panel-title"><img src="resources/${applicationScope.pid}.jpg" alt="watch" /></div>
            </div>
            <div class="panel-body">World's Best Watch.
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title"><h1>Rolex Watch-Men WAtch Model-11001</h1>
            </div>
            <div class="panel-body"><h2> Description Of Best Rolex watch:</h2>
            <h3>PRICE-1000</h3>
            <p>
             No1 company as per the satisfaction of customer.
 Best model of the rolex watch.
 Best feature-digital machine.
 Gold plated chain watch.</p>
            
            
            </div>
        </div>
        
    </div>
 
 
 <button type="button">
 <a href="addToCart?itemId=${applicationScope.pid}&custName=${pageContext.request.userPrincipal.name}" class="btn btn-info btn-lg">
          
          <span class="glyphicon glyphicon-shopping-cart"></span>ADD TO CART
   
  </a>
    
        
     </button>
     
     <button type="button">
 <a href="orderNow" class="btn btn-info btn-lg">
           Order Now
        </a>
     </button>
  </body>
</html>

