package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	private ServerSocket server_socket;
	private Socket client_socket;
	
	public Server(int port_number) throws IOException {
		server_socket = new ServerSocket(port_number);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
