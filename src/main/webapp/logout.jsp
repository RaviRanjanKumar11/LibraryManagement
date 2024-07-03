<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>
<style>

</style>
</head>

<%
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<div>
<jsp:include page="login.html"/>
</div>
</body>
</html>