package day06.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientFileMain {
    public static void main(String[] args) {


        try {
            // 서버로 접속하는 코드, 서버가 실행되어 있어야 제대로 실행 됨
            Socket cs = new Socket("192.168.0.103", 9123);


            // 받는거
            // 여기서부터 받는 코드
            InputStream is = cs.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);
            String data = bir.readLine();
            System.out.println(data);
            // 여기까지 받는 코드


            // 보내는 거
            // 여기서부터 보내는 코드
            OutputStream os = cs.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bow = new BufferedWriter(osw);

            String[] list = data.substring(10).split(",");

            boolean flag = true;
            String message;
            while(flag) {
                Scanner sc = new Scanner(System.in);
                System.out.print("서버에 요청할 파일 이름을 입력해주세요 : ");
                message = sc.nextLine();
                for(int i = 0; i < list.length; i++) {
                    if(list[i].equals(message)) flag = false;
                }
                if(flag) {
                    System.out.println("정확한 파일 이름을 입력해주세요 : " + data.substring(10));
                } else {
                    bow.write(message + "\n");
                    bow.flush();
                }
            }
            // 여기까지 보내는 코드

            String data2 = bir.readLine();
            System.out.println(data2);

            String data3 = bir.readLine();
            System.out.println(data3);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
