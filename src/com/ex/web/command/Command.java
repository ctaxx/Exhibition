package com.ex.web.command;

import javax.servlet.http.*;

public interface Command {
	 String execute(HttpServletRequest request,
				HttpServletResponse response);
}
