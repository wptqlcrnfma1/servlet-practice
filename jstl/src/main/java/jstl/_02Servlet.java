package jstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/02")
public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*
		 * 1. 객체가 오래 지속되는 순서
		 * Application(Context) Scope > Session Scope > Request Scope > Page Scope
		 * 
		 * 2. EL이 같은 이름에 값을 찾는 순서
		 * Page Scope >  Request Scope>  Session Scope> Application(Context) Scope
		 * 
		 * 주의: 같은 이름으로 여러 범위에 값을 저장하지 말 것.
		 */
		
		
		UserVo vo1 = new UserVo();
		vo1.setNo(1L);
		vo1.setName("김정석1");
		request.setAttribute("vo",vo1);
		
		// 
		UserVo vo2 = new UserVo();
		vo2.setNo(2L);
		vo2.setName("김정석2");
		
		request.getRequestDispatcher("/WEB-INF/views/02.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
