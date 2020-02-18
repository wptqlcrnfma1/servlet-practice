<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.douzone.guestbook.dao.GuestBookDao"%>
<%@page import="com.douzone.guestbook.vo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	Calendar c1 = Calendar.getInstance();
	String date = mSimpleDateFormat.format(c1.getTime());

	String name = request.getParameter("name");
	String contents = request.getParameter("message");
	String password = request.getParameter("password");
	String reg_date = request.getParameter("date");

	GuestBookVo vo = new GuestBookVo();

	vo.setNo(vo.getNo());
	vo.setName(name);
	vo.setContents(contents);
	vo.setPassword(password);
	vo.setReg_date(date);

	new GuestBookDao().insert(vo);

	response.sendRedirect("/guestbook01/index.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>