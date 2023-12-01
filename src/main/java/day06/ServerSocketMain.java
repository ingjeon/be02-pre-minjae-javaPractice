package day06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//todo 강사님
// 소캣 연결 저장된 값 주고 받기
public class ServerSocketMain {
    public static void main(String[] args) {

    {
        try {
            // 포트를 LISTEN 상태로 변경
            ServerSocket serverSocket = new ServerSocket(9001);
            // 변수 만들고 받아서 씀
            Socket clientSocket = serverSocket.accept();

            System.out.println(clientSocket.getInetAddress() + "가 접속함");

            //getInputStream() 이  InputStream 객체를 반환하니깐
            //저장도 InputStream 객체 형식으로
            InputStream clientInputStream = clientSocket.getInputStream();

            int num = clientInputStream.read();
            System.out.println(num);

            OutputStream cos = clientSocket.getOutputStream();
            cos.write(200);

            serverSocket.close();
            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

}