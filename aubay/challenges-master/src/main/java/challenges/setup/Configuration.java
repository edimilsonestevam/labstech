package challenges.setup;

public class Configuration {

	protected MessageServer server = null;
	protected String serverName = null;
	protected String userName = null;

	public MessageServer getDriver() {

		return server;

	}

	public void setDriver(MessageServer server) {

		this.server = server;

	}

	public MessageServer OpenConnectionServer(String serverName, String userName) {

		this.serverName = serverName;
		this.userName = userName;
		
		//I must development this method to open connection with MessageServer
		
		return null;
		
	}

	public void CloseConnectionServer(MessageServer server) {

		this.server = server;
		
		//I must development this method to close connection with MessageServer
		
	}

}