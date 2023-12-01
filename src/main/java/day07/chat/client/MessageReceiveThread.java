package day07.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageReceiveThread extends Thread {
    Socket socket;
    // 생성자로 소켓 받아오기
    public MessageReceiveThread(Socket socket) {
        this.socket = socket;
    }

    // 오버로딩 run 메소드
    @Override
    public void run() {
        try {
            // 입출력 스트림 예외 처리
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);

            while (true) {
                String message = bir.readLine();
                System.out.println(message);
//                if () {
//                기능구현
//                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
