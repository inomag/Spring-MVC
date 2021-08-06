<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<h3>Register a Student</h3>
	<br>
	<hr>
	
	<form:form action="processForm" modelAttribute ="student">
		First Name: <form:input path="firstName"/>
		<br>
		Last Name: <form:input path="lastName"/>
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
	
	
	
	
	
	

</body>
</html>