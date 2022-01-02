package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/plus")
public class plus extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		// 형변환
		int num = Integer.parseInt(data1);
		int num1 = Integer.parseInt(data2);
		
		// 웹에 출력하기
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out =response.getWriter();
		
		out.print(data1 + "과" + data2 + "의 합은 " + (num+num1) + " 입니다. ");
		
	}

}
