<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="students" class="com.cg.beans.Student">
<jsp:setProperty name="students" property="firstName"/>
<jsp:setProperty name="students" property="lastName"/>
<jsp:setProperty name="students" property="age"/>
</jsp:useBean>
First Name is
<jsp:getProperty property="firstName" name="students"/><br>
Last Name is
<jsp:getProperty property="lastName" name="students"/><br>
Age is
<jsp:getProperty property="age" name="students"/><br>
</body>
</html>