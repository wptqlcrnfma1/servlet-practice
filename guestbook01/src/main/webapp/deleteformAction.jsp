<%@page import="java.io.PrintWriter"%>
<%@page import="com.douzone.guestbook.vo.GuestBookVo"%>
<%@page import="com.douzone.guestbook.dao.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		String password = request.getParameter("password"); //입력한거
		String id = request.getParameter("id"); // 받아온 no값

		Long test = Long.parseLong(id);

		GuestBookVo vo = new GuestBookVo();

		vo.setPassword(password);
		vo.setNo(test);

		if (new GuestBookDao().delete(vo)) {
			new GuestBookDao().delete(vo);
			response.sendRedirect("/guestbook01/index.jsp");
		} else {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호 오류')");
			script.println("location.href = 'index.jsp'");
			script.println("</script>");
		}
	%>
</body>
</html>