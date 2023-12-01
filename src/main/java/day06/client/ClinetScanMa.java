package day06.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClinetScanMa {
    public static void main(String[] args) {
        try {
            // 서버로 접속하는 코드
            Socket clientSocket = new Socket("192.168.0.103", 9123);

            OutputStream clientOutPutStream = clientSocket.getOutputStream();

            Scanner sc = new Scanner(System.in);
            System.out.print("서버 접속 성공 숫자를 입력 : ");
            int inputNum = sc.nextInt();

            clientOutPutStream.write(inputNum);

            InputStream cli = clientSocket.getInputStream();
            int num = cli.read();
            System.out.println(num);

            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
