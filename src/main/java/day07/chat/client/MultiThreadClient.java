package day07.chat.client;

import java.io.IOException;
import java.net.Socket;

public class MultiThreadClient {
    public static void main(String[] args) {
        String serverIp = "192.168.0.103";
        int serverPort = 1945;
        Socket socket = null;

        try {
            socket = new Socket(serverIp, serverPort);

            Thread messageSendThread = new MessageSendThread(socket);
            messageSendThread.start();

            Thread messageReceiveThread = new MessageReceiveThread(socket);
            messageReceiveThread.start();

            // Main 종료 되지 않게 붙잡기
            while (true) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
