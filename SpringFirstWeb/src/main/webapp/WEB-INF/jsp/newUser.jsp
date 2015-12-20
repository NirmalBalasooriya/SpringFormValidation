<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User</title>
</head>
<body>

	Enter your User details
	<spring:url value="/saveUser" var="springUrl"/>
	<springform:form action="${springUrl}" method="POST" modelAttribute="user">
	<table style="width:100%">
	  <tr>
	    <td>User ID</td>
	    <td>
	    	<springform:input path="id"/>
			<springform:errors path="id"  />
	    </td> 
	  </tr>
	  <tr>
	    <td>First Name</td>
	    <td>
			<springform:input path="firstName"/>
			<springform:errors path="firstName"  />			
		</td> 
	  </tr>
	  <tr>
	    <td>Last Name</td>
	    <td>
			<springform:input path="lastName"/>
			<springform:errors path="lastName"  />
		</td> 
	  </tr>
	  <tr><td><br/>Address Details</td></tr>
	  <tr>
	    <td>No</td>
	    <td>
			<springform:input path="address.no"/>		
		</td> 
	  </tr>
	  <tr>
	    <td>Street</td>
	    <td>
			<springform:input path="address.Streat"/>
		</td> 
	  </tr>
	  <tr>
	    <td>City</td>
	    <td>
			<springform:input path="address.city"/>
		</td> 
	  </tr>	  	  
	  <tr>
	    <td>Area</td>
	    <td>
			<springform:input path="address.area"/>
		</td> 
	  </tr>	  	  
	  <tr>
	    <td>Country</td>
	    <td>
			<springform:input path="address.country"/>
		</td> 
	  </tr>	  	  	  	  
	  <tr>
	    <td><br/>Preffered Contact Methods</td>
	    <td>
			<springform:select path="preferredContactMethod" items="${prefContct}"></springform:select>
		</td> 
	  </tr>	  	  	  	  
	  <tr>
	    <td>Gender</td>
	    <td>
			<springform:radiobuttons id="radio" items="${sexType}" path="sex"/>
		</td> 
	  </tr>	  	  	  	  

	</table>
		
	<button type="submit"> Submit</button>	
	</springform:form>

</body>
</html>