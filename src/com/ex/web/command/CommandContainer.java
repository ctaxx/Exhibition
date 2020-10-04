package com.ex.web.command;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class CommandContainer {
	
	static Logger logger = Logger.getLogger(CommandContainer.class.getName());

	private static Map<String, Command> commands = new TreeMap<String, Command>();
	
	static {
		commands.put("getActualExs", new GetActualExsCommand());
		commands.put("getAllExs", new GetAllExsCommand());
		
		commands.put("bookATicket", new BookATicketCommand());
		commands.put("cancelBooking", new CancelBookingCommand());
		
		commands.put("signUp", new SignUpCommand());
		commands.put("signIn", new SignInCommand());
		commands.put("logout", new LogoutCommand());
		
		//admin
		commands.put("getAllUsers", new GetAllUsersCommand());
		commands.put("getCurrentUsers", new GetCurrentUsers());
		commands.put("cancelEx", new CancelExCommand());
	}
	
	public static Command get(String commandName) {
		logger.info("CommandContainer get command: " + commandName);
		if (commandName == null || !commands.containsKey(commandName)) {
			return commands.get("noCommand"); 
		}
		
		return commands.get(commandName);
	}
}
