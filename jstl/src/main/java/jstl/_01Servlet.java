package jstl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iVal = 10;
		long lVal = 10;
		float fVal = 1.4F;
		boolean bVal = true;
		String contents = "가"+"\n"+"나";
		//객체 테스트
		UserVo userVo = new UserVo();
		userVo.setNo(10L);
		userVo.setName("김정석2222222222");
		
		//map을 사용해서 여러 값을 한번에 넘기는 방법
		Map<String, Object> map = new HashMap<>();
		map.put("ival", iVal);
		map.put("lval", lVal);
		map.put("fval", fVal);
		map.put("dval", bVal);
		
		request.setAttribute("iva", iVal); //request 범위에 담는거
		request.setAttribute("lval", lVal);
		request.setAttribute("fval", fVal);
		request.setAttribute("dval", bVal);
		request.setAttribute("sval", contents);
		request.setAttribute("vo", userVo);
		request.setAttribute("map", map); //key 이름으로 접근하면된다.
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
