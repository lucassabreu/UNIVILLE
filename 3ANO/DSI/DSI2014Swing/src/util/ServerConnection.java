package util;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejb.ClienteBeanRemote;

public class ServerConnection {
	//Singleton
	private static ServerConnection instance;
	private InitialContext ic;
	private ClienteBeanRemote ClienteRemoto;

	private ServerConnection() {
		try {
			ic = new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public ClienteBeanRemote getClienteBeanRemote(){
		if(ClienteRemoto == null){
			try {
				ClienteRemoto = (ClienteBeanRemote) 
						ic.lookup("java:global/DSI2014Server/DSI2014EJB/ClienteBean!ejb.ClienteBeanRemote");
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
        return ClienteRemoto;
	}
	public static ServerConnection getInstance(){
		if(instance == null)
			instance = new ServerConnection();
		return instance;
	}
}

