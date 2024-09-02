<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="Test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cookie[] c=request.getCookies();
String name=(String)c[0].getValue();
UserBean ub=(UserBean)application.getAttribute("ubean"); 
out.println("page belongs to :"+name+"<br>");
out.println(ub.getFname() +"&nbsp&nbsp"+ub.getLname() +"&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp"+
ub.getMid() +"&nbsp&nbsp"+ub.getPhono() +"&nbsp&nbsp"+"&nbsp&nbsp"+"<a href='edit'>Edit</a>"+"<br>");
%>
<a herf="Logout"> Logout</a>

</body>
</html>