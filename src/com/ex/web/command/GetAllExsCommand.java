package com.ex.web.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ex.entity.*;
import com.ex.Path;

import com.ex.db.DBUtils;

public class GetAllExsCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBUtils dbUtils = new DBUtils();
		List<Exhibition> valueFromDB = dbUtils.getExs();
		
		request.setAttribute("values", valueFromDB);
		
		return Path.MAIN_PAGE;
	}
}
