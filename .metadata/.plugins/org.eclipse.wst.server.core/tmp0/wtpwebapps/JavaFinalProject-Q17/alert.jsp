<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alert</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
</head>
<body>
 <div class="container">
      <div class="card mt-5">
        <div class="card-header fw-semibold fs-5">Alert</div>
        <div class="card-body">
        <c:choose>
		    <c:when test="${msg == 'success'}">
		       <div class="alert alert-success" role="alert">
            	 Successfully posted !
          		</div>
		        <br />
		    </c:when>    
		    <c:otherwise>
		        <div class="alert alert-danger" role="alert">
            	 Error in saving the post !
          		</div>
		        <br />
		    </c:otherwise>
		</c:choose>         
          <a href="../" role="button" class="btn btn-outline-primary float-end w-25">Back</a>
        </div>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
      integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
      integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
      crossorigin="anonymous"
    ></script>
  </body>
</body>
</html>