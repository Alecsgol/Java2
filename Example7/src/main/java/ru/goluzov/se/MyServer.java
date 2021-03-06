package ru.goluzov.se;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void start() {
        final int PORT = 8080;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandler.run(clientHandler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}