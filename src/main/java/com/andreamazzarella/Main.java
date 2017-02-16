package com.andreamazzarella;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new ServerSocket(5000).accept();
        new PrintStream(socket.getOutputStream()).println("HTTP/1.1 200 OK\n");
    }
}
