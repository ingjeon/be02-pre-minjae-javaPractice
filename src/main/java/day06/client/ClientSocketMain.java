package day06.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
//todo 강사님
public class ClientSocketMain {
    public static void main(String[] args) {
        try {
            // 서버로 접속하는 코드
            Socket clientSocket = new Socket("192.168.0.103", 9123);

            OutputStream clientOutPutStream = clientSocket.getOutputStream();
            clientOutPutStream.write(100);

            InputStream cli = clientSocket.getInputStream();
            int num = cli.read();
            System.out.println(num);

            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
