<%@ page language="java"
 contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="green" text="black">
<% 
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<jsp:include page="login.html"/>
</body>
</html>