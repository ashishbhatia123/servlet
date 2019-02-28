<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
		<body>
			<table border=1>
			<tr>
			<th>EmpNo</th>
			<th>Name</th>
			<th>Salary</th>
			<th> Actions</th>
			</tr>
			<c:forEach items="${empList}" var = "emp">
			<tr>
			<td>${emp.empId} </td>
			<td> ${emp.empName}</td>
			<td> ${emp.empSal}</td>
			<td> <a href="viewDetails.hr?id=${emp.empId}">view Details</a></td>
			</tr>
			</c:forEach>
			</table>
		</body>
</html>