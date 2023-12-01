package day07.chat;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiThreadServer {
    static List<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args) {
        int port = 1945;

        try {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                socketList.add(socket);
                Thread mpt = new MessageProcessThread(socket);
                mpt.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}