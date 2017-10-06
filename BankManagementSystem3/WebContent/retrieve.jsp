<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList, com.cg.bean.bank.BankBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<BankBean> myList=(ArrayList<BankBean>)session.getAttribute("list"); %>
<%for(BankBean c:myList){
out.print(c.getcID());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getCustomerName());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getPhoneNo());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getPassword());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getReenterPassword());
out.print("<br/>");

}	
	%>
</body>
</html>