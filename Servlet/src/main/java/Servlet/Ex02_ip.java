package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02_ip")
public class Ex02_ip extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 들어온 사람에 따라서 다른 화면 보여주기
		// ip확인하기
		String client = request.getRemoteHost();
		System.out.println("들어온 사람은 : " + client);
		
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset=euc-kr");
		
		// 출력 스트림 열기
		PrintWriter out = response.getWriter();
		
		if(client.equals("172.30.1.31")) {
			out.print("용희씨 반갑습니다.");
			out.print("<img src='./img/오겜 관리자.png'>");
		}else {
			out.print("용희씨가 아닙니다!");
			out.print("<img src= 'img/세모.jpg'>");
		}
	}

}
