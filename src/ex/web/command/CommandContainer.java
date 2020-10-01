package ex.web.command;

import java.util.Map;
import java.util.TreeMap;

public class CommandContainer {

	private static Map<String, Command> commands = new TreeMap<String, Command>();
	
	static {
		commands.put("getActualExs", new GetActualExsCommand());
		commands.put("getAllExs", new GetAllExsCommand());
		
		commands.put("signUp", new SignUpCommand());
		commands.put("signIn", new SignInCommand());
		commands.put("logout", new LogoutCommand());
		
		//admin
		
		
	}
}
