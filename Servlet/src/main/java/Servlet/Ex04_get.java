package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ex04_get")
public class Ex04_get extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// �����͸� �޾ƿ��� ����
		// ����ڰ� �Է��� ������ ��������
		String data = request.getParameter("data");
		System.out.println("���� �Է��� �����ʹ� : " + data);
		
		//  �ѱ۷� �ް� ���� �� : get��� ���ڵ�
		//  Server���� - server.xml -> 63��°�� Connector�±� -> URIEncoding="���ڵ����"
	}

}
