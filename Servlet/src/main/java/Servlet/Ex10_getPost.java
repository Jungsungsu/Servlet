package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex10_getPost")
public class Ex10_getPost extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get방식 디코딩
		//server폴더 - server.xml - 63번째 Connector태그
		//URIEncoding="인코딩방식"
		
		//post방식 디코딩
		//데이터가 들어있는 객체에 인코딩 방식을 지정
		request.setCharacterEncoding("EUC-KR");
		
		String data = request.getParameter("data");
		System.out.println("입력한 data는 : " + data);
		
		
	}

}