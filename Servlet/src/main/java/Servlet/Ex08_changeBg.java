package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08_changeBg")
public class Ex08_changeBg extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 데이터를 받아오는 서블릿
		// 사용자가 입력한 데이터 가져오기
		String color = request.getParameter("color");
		System.out.println(color);
		
		
		// 웹에 출력하기
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out =response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<body bgcolor="+color+">");
		out.print("정성수");
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		
		//  한글로 받고 싶을 때 : get방식 인코딩
		//  Server폴더 - server.xml -> 63번째줄 Connector태그 -> URIEncoding="인코딩방식"
		
		
	}

}
