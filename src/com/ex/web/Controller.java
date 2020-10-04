package com.ex.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.web.command.Command;
import com.ex.web.command.CommandContainer;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Controller() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String commandType = request.getParameter("command");
		Command command = CommandContainer.get(commandType);

		String forward = "";

		forward = command.execute(request, response);

		request.getRequestDispatcher(forward).forward(request, response);

//		DBUtils dbUtils = new DBUtils();
//		String valueFromDB = dbUtils.getUser();
//		
//		response.getWriter()
//		.append("<html>")
//		.append("<head><title>Result Servlet</title></head>")
//		.append("<body>")
//		.append("<h3>Result Servlet</h3>")
//		.append("This is test Servlet")
//		.append("<br>")
//		.append(commandType)
//		.append("<br>")
//		.append("<br>")
//		.append("value has been got from the database:")
//		.append("<br>")
//		.append(valueFromDB)
//		.append("</body>")
//		.append("<html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
