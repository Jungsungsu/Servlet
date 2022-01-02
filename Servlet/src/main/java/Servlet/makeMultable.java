package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/makeMultable")
public class makeMultable extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String color = request.getParameter("color");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<style> table {background : " + color + "}</style>");
		out.print("</head>");
		out.print("</body>");
		out.print("</html>");

		out.print("<table border = 1>");

		for (int j = num1; j <= num2; j++) {
			out.print("<tr>");
			for (int i = 1; i <= 9; i++) {
				out.print("<td> " + j + "*" + i + "=" + i * j + " </td>");
			}
			out.print("</tr>");
			out.print("\n");
		}
		out.print("</table>");
	}

}
