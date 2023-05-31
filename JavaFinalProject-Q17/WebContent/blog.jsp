<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blog</title>
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
        <div class="card-header fw-semibold fs-5">Blog</div>
        <div class="card-body d-flex flex-column gap-3">
        <c:forEach items="${posts}" var="post">
		    <div class="card">
	            <div class="card-body">
	              <h5 class="card-title">${post.title}</h5>
	              <h6 class="card-subtitle mb-2 text-muted">${post.description}</h6>
	              <p class="card-text">
	                ${post.content}
	              </p>
	            </div>
	        </div>
		</c:forEach>          
        </div>
        <div class="card-footer text-muted">
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
</html>