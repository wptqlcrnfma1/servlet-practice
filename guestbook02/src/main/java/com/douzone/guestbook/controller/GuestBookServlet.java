package com.douzone.guestbook.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

//@WebServlet("/gb")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("a");

		if ("add".equals(action)) {
			SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			Calendar c1 = Calendar.getInstance();

			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String contents = request.getParameter("message");
			String date = mSimpleDateFormat.format(c1.getTime());

			GuestBookVo vo = new GuestBookVo();

			vo.setName(name);
			vo.setPassword(password);
			vo.setContents(contents);
			vo.setReg_date(date);

			new GuestBookDao().insert(vo);

			response.sendRedirect(request.getContextPath() + "/gb");

		} else if ("deleteform".equals(action)) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);
		} else if ("delete".equals(action)) {
			String no = request.getParameter("no");	 // 받아온 no값
			String password = request.getParameter("password"); // 입력한거
		
			GuestBookVo vo = new GuestBookVo();

			vo.setNo(Long.parseLong(no));
			vo.setPassword(password);
			if (new GuestBookDao().delete(vo)) {
				new GuestBookDao().delete(vo);
				response.sendRedirect(request.getContextPath() + "/gb");
			} else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('비밀번호 오류')");
				script.println("location.href = 'index.jsp'");
				script.println("</script>");
			}
			new GuestBookDao().delete(vo);
			response.sendRedirect( request.getContextPath() + "/gb" );

		}

		else {
			// list(default) 처리
			List<GuestBookVo> list = new GuestBookDao().findAll();

			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
