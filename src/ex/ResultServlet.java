package ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hello")
public class ResultServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ResultServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("name");
		String password = request.getParameter("password");

		ServletOutputStream out = response.getOutputStream();
		DBUtils dbUtils = new DBUtils();
		String valueFromDB = dbUtils.getUser();
		
		out.println("<html>");
		out.println("<head><title>Result Servlet</title></head>");

		out.println("<body>");
		out.println("<h3>Result Servlet</h3>");
		out.println("This is test Servlet");
		out.println("<br>");
		out.println(userName);
		out.println("<br>");
		out.println(password);
		out.println("<br>");
		out.println("<br>");
		out.println("value has been got from the database:");
		out.println("<br>");
		out.println(valueFromDB);
		out.println("</body>");
		out.println("<html>");

		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
