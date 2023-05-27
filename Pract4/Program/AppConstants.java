package program;

import java.time.format.DateTimeFormatter;

public interface AppConstants {

	public final String SERVER_NAME_1 = "localhost";
	public final int SERVER_PORT_1 = 3000;
	
	public final String SERVER_NAME_2 = "localhost";
	public final int SERVER_PORT_2 = 5000;
	
	public final String SERVER_NAME_3 = "localhost";
	public final int SERVER_PORT_3 = 8000;
	
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	
}


