package ru.goluzov.se;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        final String ADDR = "localhost";
        final int PORT = 8080;
        try (Socket socket = new Socket(ADDR, PORT)){
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());
            Scanner input = new Scanner(System.in);

            new Chat(in, input, out, "Client").run();
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
        }
    }
}