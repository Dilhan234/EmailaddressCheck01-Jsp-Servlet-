<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Email Check Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Email Check Result</h1>
    <p><strong>Entered Email:</strong> <%= request.getAttribute("email") %></p>
    <p><strong>Validation Result:</strong> <%= request.getAttribute("result") %></p>
    <p><a href="emailForm.html">Go Back</a></p>
</body>
</html>