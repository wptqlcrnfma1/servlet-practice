package com.douzone.helloweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //post로 넘어오는 형식 encoding
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String birthYear = request.getParameter("birthYear");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		String desc = request.getParameter("desc");
		
		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("birthYear : " + birthYear);
		System.out.println("gender : " + gender);
		for(String hobby : hobbies) {
			System.out.println("hobby : "+hobby);
		}
		System.out.println("desc : " + desc);
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
