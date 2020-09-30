package ex.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex.db.DBUtils;


@WebServlet("/getInfo")
public class ResultServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ResultServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		
		DBUtils dbUtils = new DBUtils();
		String valueFromDB = dbUtils.getUser();
		
		response.getWriter()
		.append("<html>")
		.append("<head><title>Result Servlet</title></head>")
		.append("<body>")
		.append("<h3>Result Servlet</h3>")
		.append("This is test Servlet")
		.append("<br>")
		.append(userName)
		.append("<br>")
		.append(password)
		.append("<br>")
		.append("<br>")
		.append("value has been got from the database:")
		.append("<br>")
		.append(valueFromDB)
		.append("</body>")
		.append("<html>");
				
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
