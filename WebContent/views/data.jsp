<%@page import="dao.GetDataDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="models.Bee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		ArrayList<Bee> listBee = (ArrayList<Bee>) request.getAttribute("listBee");
	%>
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Health</td>
			<td>Type</td>
			<td>Status</td>
		</tr>
		<%
			if (listBee != null) {
				session.setAttribute("listBee", listBee);
				for (int i = 0; i < listBee.size(); i++) {
		%>
		
		<tr>
			<td><%=listBee.get(i).getId()%></td>
			<td><%=listBee.get(i).getName()%></td>
			<td><%=listBee.get(i).getHealth()%></td>
			<td><%=listBee.get(i).type()%></td>
			<td><%=listBee.get(i).getStatus()%></td>
		</tr>
		
		<%
			}
			}
		%>
	</table>
</body>
</html>