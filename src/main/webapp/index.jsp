<html>
<%@include  file="header.jsp" %>
<head>
<title>Watches Store</title>
<style>
img {
    border-radius: 50%;
}
</style>

</head>
<body>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="images/watch12.jpg" alt="watch">
    </div>

    <div class="item">
      <img src="images/watch5.jpg" alt="watch">
    </div>

    <div class="item">
      <img src="images/watch11.jpg" alt="watch">
    </div>

 </div>
  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
  <div class="row">
    <div class="col-md-4">
      <a href="images/watch3.jpg" class="thumbnail">
          <p>silver chain watch</p>
        <img src="images/watch3.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
        
      </a>
    </div>
    <div class="col-md-4">
      <a href="images/watch6.jpg" class="thumbnail">
              <p>with a gold platted chain watch</p>  
        <img src="images/watch6.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px"/>
        </a>
    </div>
    <div class="col-md-4">
      <a href="images/watch7.jpg" class="thumbnail">
         <p>looks like a sports watch</p>
        <img src="images/watch7.jpg" alt="Cinque Terre" style="width:150px;height:150px"/>
        
      </a>
    </div>
  
<%@include file="footer.jsp" %>
</body>
</html>
