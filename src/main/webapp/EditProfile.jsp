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
<% String fName=(String)request.getAttribute("fname");
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println(" page to belongs "+fName+"<br>");
%>
<form action="update"  method="post" >
Address:<input type="text" name="addr" value <%=ub.getAddr()%>><br>
mailId:<input type="text" name="mid" value <%=ub.getMid()%>><br>
PhoneNo:<input type="text" name="phno" value<%=ub.getPhono()%>><br>
<input type="submit" value="updateProfile">
</form>
</body>
</html>