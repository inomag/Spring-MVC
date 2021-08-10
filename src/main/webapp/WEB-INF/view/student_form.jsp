<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>
	<h3>Register a Student</h3>
	<br>
	<hr>
	
	<form:form action="processForm" modelAttribute ="student">
		First Name :  <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		
		<br><br>
		Last Name :  <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		Age : <form:input path="age" type="number"/>
		<form:errors path="age" cssClass="error"/>
		<br><br>
		Phone No. :  <form:input path="phoneNo"/>
		<form:errors path="phoneNo" cssClass="error"/>
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
		Primary Language:
		<br>
		Java <form:radiobutton path="language" value="Java"/>  
        C++ <form:radiobutton path="language" value="C++"/>
        C <form:radiobutton path="language" value="C"/>
        
        <br><br>
		Secondary Language:
		<br>
		Java <form:radiobutton path="secondaryLanguage" value="Java"/>  
        C++ <form:radiobutton path="secondaryLanguage" value="C++"/>
        C <form:radiobutton path="secondaryLanguage" value="C"/>
        <br><br>
        
		<input type="submit" value="Submit"/>
	</form:form>
	
	
	
	
	
	

</body>
</html>