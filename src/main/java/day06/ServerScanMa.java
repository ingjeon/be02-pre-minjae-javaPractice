package day06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
// todo 옆사람과 소캣 연결 Scanner로 입력한 내용  주고받기
public class ServerScanMa {
    public static void main(String[] args) {


        {
            try {
                // 포트를 LISTEN 상태로 변경
                ServerSocket serverSocket = new ServerSocket(9123);
                // 변수 만들고 받아서 씀
                Socket clientSocket = serverSocket.accept();

                System.out.println(clientSocket.getInetAddress() + "가 접속함");

                InputStream clientInputStream = clientSocket.getInputStream();

                int num = clientInputStream.read();
                System.out.println(num);

                OutputStream cos = clientSocket.getOutputStream();

                Scanner sc = new Scanner(System.in);
                System.out.print("클라이언트에게 전달할 숫자 입력 : ");
                int inputNum = sc.nextInt();
                cos.write(inputNum);

                serverSocket.close();
                clientSocket.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
