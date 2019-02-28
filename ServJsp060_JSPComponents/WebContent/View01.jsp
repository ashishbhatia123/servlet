<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,java.util.Calendar" %>
    <%@ page session ="true" %>
<%! private int x=10; %>
<%! public int getValue()
{ return 10;} %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	for(int i=0;i<5;i++)
	{

	%>
	Capgemini Solutions . 
	<% }  %>
	<%= x %> 
	<%= getValue() %>	
</body>
</html>

<%-- 
	Directives  <%@   %>
		3 types of directive
		--page :session ,import
		--taglib : 
		--include: 
		
	Declaration  <%!  %>
		They are contents of class instanceFields ,Methods .		
	Scriptlets : <% %>
		Its a java code to be added inside service()
	Expressions :
		A single value to print
	Template :
		Its a HTML Part
	Elements : <jsp: xxxxxxx>
		examples are forward , include .
		
 --%>
 
 <%--
 	Implicit Tags 
 	variable that are ready in jsp.java file
 		1. ServletConfig : application
 		2. ServletContext : context
 		3. HttpServletRequest :request
 		4. HttpServletResponse : response
		5. HttpSession session
		6. JspWriter out : Handle to response.
		7. Page page : Like this
		8. Page Context pageContext : Bundle of jsp Resources 
		9.Exception exception : Refers to Exception 
				Available on only those JSP for whome 
				<%-- <%@ page isErrorPage =true %> --%>
		
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 