<%@page import="com.douzone.guestbook.dao.GuestBookDao"%>
<%@page import="java.util.List"%>
<%@page import="com.douzone.guestbook.vo.GuestBookVo"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<GuestBookVo> list = new GuestBookDao().findAll();
GuestBookVo vo = new GuestBookVo();

String no = request.getParameter("no");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>방명록<%=no%></title>
</head>
<body>
	<form method="post" action="/guestbook01/deleteformAction.jsp">
	<input type='hidden' name="id" value = "<%=no%>">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password" value=""></td>
			
			<td><input type="submit" value="확인"></td>
			<td><a href="/guestbook01/index.jsp">메인으로 돌아가기</a></td>
		</tr>
	</table>
	</form>
	
	
	
	
	
</body>
</html>