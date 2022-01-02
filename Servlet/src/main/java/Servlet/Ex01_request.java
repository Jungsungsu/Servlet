package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping
@WebServlet("/Ex01_request")

// Servlet : HttpServlet을 상속 받음!
public class Ex01_request extends HttpServlet {
		// service 메소드 : Java의 main메소드와 같은 역할
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.request객체 : 사용자가 요청을 했을 때 요청에 대한 정보를 담고 있는 객체
		// ex) 요청이 들어온 주소, 사용자가 입력한 정보(id,pw 등)..
		// 실습1. 요청이 들어온 ip주소 확인하기
		String client = request.getRemoteHost();
		System.out.println("들어온 사람 : " + client);
		
		
		//2. response객체 : 사용자에게 응답을 해줄 수 있게 하는 객체
		// ex) HTML문서, Text, 페이지 이동, 이미지 등...
		response.setContentType("text/html; charset=euc-kr");
		
		
		// 웹에 출력하기
		// 사용자에게 데이터를 전달할 수 있는 통로
		PrintWriter out = response.getWriter();
		
		
		// out 객체 : text, tag를 혼합해서 전송 가능!
		out.print("안녕하세요");
		out.print("<h1> 제 이름은 정성수입니다. <h1>");
		
		
		// 이미지 넣기
		out.print("<img src='./img/오겜.png'>");
		
		if(client.equals("172.30.1.17")) {
			out.print("선생님 환영합니다");
			out.print("<img src='./img/오겜.png'>");
		} else if(client.equals("172.30.1.35")) {
			out.print("짝꿍");
			out.print("<img src='./img/오겜.png'>");
	    } else {
			out.print("<img src='./img/오겜.png'>");
			out.print("나가주세요");
		}
		
		

	}
}
