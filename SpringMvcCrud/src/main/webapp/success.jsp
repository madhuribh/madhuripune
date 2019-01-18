<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<form name="suc">
		<table border="3">
			<tr>
				<td>Sid</td>
				<td>Name</td>
				<td>Address</td>
				<td>Mobile</td>
				<td>Username</td>
				<td>Password</td>
				<td>Delete</td>
				<td>Edit</td>
			</tr>
			<c:forEach items="${data}" var="st">
				<tr>
					<td><c:out value="${st.sid}"></c:out></td>
					<td><c:out value="${st.name}"></c:out></td>
					<td><c:out value="${st.address}"></c:out></td>
					<td><c:out value="${st.mobile}"></c:out></td>
					<td><c:out value="${st.username}"></c:out></td>
					<td><c:out value="${st.password}"></c:out></td>
					<td><a href="deleteel${st.sid}">Delete</td>
					<td><a href="editel${st.sid}">Edit</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>