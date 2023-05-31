<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Post</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		<div class="card mt-5">
			<div class="card-header fw-semibold fs-5">Create New Post</div>
			<div class="card-body">
				<form action="../blog/savepost" method="post">
					<div class="row justify-content-center">
						<div class="mb-3">
							<label for="titlev" class="form-label fw-semibold">Title</label>
							<input type="text" class="form-control" name="title" id="title"
								placeholder="Title" required/>
						</div>
						<div class="mb-3">
							<label for="description" class="form-label fw-semibold">Description</label>
							<input type="text" class="form-control" name="description"
								id="description" placeholder="Brief Description" required/>
						</div>
						<div class="mb-3">
							<label for="content" class="form-label fw-semibold">Content</label>
							<textarea class="form-control" name="content" id="content"
								rows="3" placeholder="Content" required></textarea>
						</div>
						<div class="mb-3">
							<button type="submit" class="btn btn-success float-end w-25 fs-5">
								Create</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
</body>
</html>