package com.william.keyphone.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.net.ssl.SSLSocketFactory;

/**
 * Created by Edwin on 3/4/2016.
 */

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public class Client {
        private static final String HOST = "10.31.116.173";

        private static final int PORT = 10000;

        public Client() throws IOException {
            System.setProperty("javax.net.ssl.trustStore", "/storage/emulated/0/Download/keystore.jks");
            System.setProperty("javax.net.ssl.trustStoreSSN", "wshr.ut");
            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();

            SSLSocket s = (SSLSocket)sf.createSocket(HOST, PORT);
            s.startHandshake();
            OutputStream out = s.getOutputStream();
            out.write("Connection established.".getBytes());
            out.flush();


            s.close();
        }
    }




