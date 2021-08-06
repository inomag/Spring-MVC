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
		First Name:  <form:input path="firstName"/>
		<br><br>
		Last Name:  <form:input path="lastName"/>
		<br><br>
		Country:  <form:select path="country">
			<%-- <form:option value="" label="Select Country"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Canada" label="Canada"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Britain" label="Britain"></form:option>
			<form:option value="Italy" label="Italy"></form:option> --%>
			
			<form:options items = "${student.countryOptions}"/>
		</form:select>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
	
	
	
	
	
	

</body>
</html>