package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex11_userInfo")
public class Ex11_userInfo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		// post��� ���ڵ�
	      request.setCharacterEncoding("EUC-KR");
	      
	      // ������ �޾ƿ���
	      String id = request.getParameter("id");
	      String pw = request.getParameter("pw");
	      String gender = request.getParameter("gender");
	      String blood = request.getParameter("blood");
	      String birth = request.getParameter("birth");
	      String[] hobby = request.getParameterValues("hobby");
	      String color = request.getParameter("color");
	      String message = request.getParameter("message");
	      
	      // ���� ����ϱ�
	      response.setContentType("text/html; charset=euc-kr");
	      PrintWriter out = response.getWriter();
	      
	      
	      // ���̺� ���� �̸�
	      out.print("id : "+id+"<br>");
	      out.print("pw : "+pw+"<br>");
	      out.print("gender : "+gender+"<br>");
	      out.print("blood : "+blood+"<br>");
	      out.print("birth : "+birth+"<br>");
	      out.print("hobby : ");
	      for(int i=0; i<hobby.length; i++) {
	         out.print(hobby[i]+" ");
	      }
	      out.print("<br>");
	      out.print("color : "+color+"<br>");
	      out.print("message : "+message+"<br>");


		
	}

}
