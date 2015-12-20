<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users</title>
</head>
<body>

<table style="width:100%">
  <thead>
  <tr>
    <b>
    <td>ID</td>
    <td>Name</td> 
    <td>Contact method</td>
    </b>
  </tr>  
  </thead>
  <jstl:forEach var="user" items="${users}">
  <tr>
    <td>${user.id}</td>
    <td>${user.firstName} ${user.lastName}</td> 
    <td>
    <jstl:forEach var="contacts" items="${user.preferredContactMethod}">
    ${contacts}
    </jstl:forEach>
    </td>
  </tr>				
  </jstl:forEach>
</body>
</html>