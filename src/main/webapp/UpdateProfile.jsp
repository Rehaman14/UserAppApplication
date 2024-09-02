<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String fName=(String)request.getAttribute("fName");
String msg=(String)request.getAttribute("msg");
out.println("page belongs to "+fName+"<br>");
out.println(msg);
%>
<a herf ="View"> ViewProfile</a>
<a herf="LogOut">LogOut</a>
</body>
</html>