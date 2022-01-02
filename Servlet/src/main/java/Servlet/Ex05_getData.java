package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ex05_getData")
public class Ex05_getData extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 데이터를 받아오는 서블릿
				// 사용자가 입력한 데이터 가져오기
				String data1 = request.getParameter("num");
				String data2 = request.getParameter("num");
				
				// 형변환
				int num = Integer.parseInt(data1);
				int num1 = Integer.parseInt(data2);
				
				// 웹에 출력하기
				response.setContentType("text/html; charset=euc-kr");
				
				PrintWriter out =response.getWriter();
				
				out.print("제 이름은" + data1 + " 입니다.");
				out.print("<br>");
				out.print("제 이름은" + data2 + " 살 입니다.");
				
				//  한글로 받고 싶을 때 : get방식 인코딩
				//  Server폴더 - server.xml -> 63번째줄 Connector태그 -> URIEncoding="인코딩방식"
				
				
	}

}
