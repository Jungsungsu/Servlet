package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping 
// Servlet�� ���۽�Ű�� ���ؼ� ���� ��� ��ſ� ����ϴ� ���ڿ�
// ���ڿ��� ServletŬ������ mapping(����)��Ų��.
// ����1. ��ΰ� �ʹ� ��� ����
// ����2. ���Ȼ��� ����
@WebServlet("/a")
public class Ex03_urlMapping extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
