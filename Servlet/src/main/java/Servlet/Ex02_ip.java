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
		
		// ���� ����� ���� �ٸ� ȭ�� �����ֱ�
		// ipȮ���ϱ�
		String client = request.getRemoteHost();
		System.out.println("���� ����� : " + client);
		
		// ������ �������� ���� ����
		response.setContentType("text/html; charset=euc-kr");
		
		// ��� ��Ʈ�� ����
		PrintWriter out = response.getWriter();
		
		if(client.equals("172.30.1.31")) {
			out.print("���� �ݰ����ϴ�.");
			out.print("<img src='./img/���� ������.png'>");
		}else {
			out.print("���񾾰� �ƴմϴ�!");
			out.print("<img src= 'img/����.jpg'>");
		}
	}

}
