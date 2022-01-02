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

// Servlet : HttpServlet�� ��� ����!
public class Ex01_request extends HttpServlet {
		// service �޼ҵ� : Java�� main�޼ҵ�� ���� ����
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.request��ü : ����ڰ� ��û�� ���� �� ��û�� ���� ������ ��� �ִ� ��ü
		// ex) ��û�� ���� �ּ�, ����ڰ� �Է��� ����(id,pw ��)..
		// �ǽ�1. ��û�� ���� ip�ּ� Ȯ���ϱ�
		String client = request.getRemoteHost();
		System.out.println("���� ��� : " + client);
		
		
		//2. response��ü : ����ڿ��� ������ ���� �� �ְ� �ϴ� ��ü
		// ex) HTML����, Text, ������ �̵�, �̹��� ��...
		response.setContentType("text/html; charset=euc-kr");
		
		
		// ���� ����ϱ�
		// ����ڿ��� �����͸� ������ �� �ִ� ���
		PrintWriter out = response.getWriter();
		
		
		// out ��ü : text, tag�� ȥ���ؼ� ���� ����!
		out.print("�ȳ��ϼ���");
		out.print("<h1> �� �̸��� �������Դϴ�. <h1>");
		
		
		// �̹��� �ֱ�
		out.print("<img src='./img/����.png'>");
		
		if(client.equals("172.30.1.17")) {
			out.print("������ ȯ���մϴ�");
			out.print("<img src='./img/����.png'>");
		} else if(client.equals("172.30.1.35")) {
			out.print("¦��");
			out.print("<img src='./img/����.png'>");
	    } else {
			out.print("<img src='./img/����.png'>");
			out.print("�����ּ���");
		}
		
		

	}
}
