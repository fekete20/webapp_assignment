<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>

<p><h1>Search for doors by ID</h1></p>
	<form action="getDoor">
	Give the ID: <input type="text" name="id"><br>
	<input type="submit" value="List"><br>
	</form>

<p><h1>Add a door</h1></p>

	<form action="addDoor">
			ID: <input type="text" name="id"><br>
			Height: <input type="text" name="height"><br>
			Name: <input type="text" name="name"><br>
			Width: <input type="text" name="width"><br>
			Price: <input type="text" name="price"><br>
			<input type="submit" value="Add to DB"><br>
		</form>

</body>
</html>