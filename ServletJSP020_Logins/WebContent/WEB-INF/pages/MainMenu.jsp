<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		<h1>Capgemini Solutions, Talwade , Pune</h1>
		Welcome Mr. / Ms. <%=request.getAttribute("fullname") %> <!-- JSP Expression -->
		<a href= ""> List all employess</a>
		<a href= ""> view details of employee</a>
		
	</body>
</html>