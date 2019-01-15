package ru.goluzov.se.client.server;

public class MainServer {

    public static void main(String[] args) {

        try {
            new ServerApp(8290).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}