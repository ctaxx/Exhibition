package com.ex.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.db.DBUtils;

public class GetAllExsCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBUtils dbUtils = new DBUtils();
		String valueFromDB = dbUtils.getExs();
		
		request.setAttribute("value", valueFromDB);
		
		return "mainPage.jsp";
	}


}
