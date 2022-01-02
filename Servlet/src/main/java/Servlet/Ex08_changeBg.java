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
	
		// �����͸� �޾ƿ��� ����
		// ����ڰ� �Է��� ������ ��������
		String color = request.getParameter("color");
		System.out.println(color);
		
		
		// ���� ����ϱ�
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out =response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<body bgcolor="+color+">");
		out.print("������");
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		
		//  �ѱ۷� �ް� ���� �� : get��� ���ڵ�
		//  Server���� - server.xml -> 63��°�� Connector�±� -> URIEncoding="���ڵ����"
		
		
	}

}
