"<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="upd">
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:set var="st" value="${stud}"></c:set>
		<table border="3">
			<tr>
				<td>Sid</td>
				<td><input type="text" name="sid" value="${st.sid}"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${st.name}"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" value="${st.address}"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="${st.mobile}"></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" value="${st.username}"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="${st.password}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>