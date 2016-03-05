package com.william.keyphone.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Edwin on 3/4/2016.
 */
public class Client {
    private Socket client_socket;
    private PrintWriter out;
    private BufferedReader in;
    private static final int MSG_QUEUED = 1;
    private static final String SERVER_IP = "10.20.29.82";


    public Client()throws IOException{

        InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
        client_socket = new Socket(serverAddr, 10000);

       // out = new PrintWriter(client_socket.getOutputStream(), true);
       // in = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
       // SendMsg();

    }

    public void SendMsg(){
        out.println(MSG_QUEUED);
    }

}
