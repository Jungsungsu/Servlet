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
		// �����͸� �޾ƿ��� ����
				// ����ڰ� �Է��� ������ ��������
				String data1 = request.getParameter("num");
				String data2 = request.getParameter("num");
				
				// ����ȯ
				int num = Integer.parseInt(data1);
				int num1 = Integer.parseInt(data2);
				
				// ���� ����ϱ�
				response.setContentType("text/html; charset=euc-kr");
				
				PrintWriter out =response.getWriter();
				
				out.print("�� �̸���" + data1 + " �Դϴ�.");
				out.print("<br>");
				out.print("�� �̸���" + data2 + " �� �Դϴ�.");
				
				//  �ѱ۷� �ް� ���� �� : get��� ���ڵ�
				//  Server���� - server.xml -> 63��°�� Connector�±� -> URIEncoding="���ڵ����"
				
				
	}

}
