package day06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ServerFileMain {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            // 포트를 LISTEN 상태로 변경
            ServerSocket serverSocket = new ServerSocket(9123);
            // serverSocket.accept()는 클라이언트 쪽에서 new Socket()이 실행되어야 끝남
            Socket cs = serverSocket.accept();


            // 여기서부터 보내는 코드
            OutputStream os = cs.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bow = new BufferedWriter(osw);

            // 파일 목록
            File dir = new File("C:\\test1");
            String[] filenames = dir.list();
            bow.write("현재 파일 목록: " + Arrays.toString(filenames).substring(1,Arrays.toString(filenames).length()-1) + "\n");
            bow.flush();
            // 여기까지 보내는 코드


            // 여기서부터 받는 코드
            InputStream is = cs.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);
            String filename = bir.readLine();
            // 여기까지 받는 코드

            bow.write("확인 완료 ");
            bow.write(filename+"파일 복사 진행중..."+"\n");
            bow.flush();

            // 파일 복사 구글 긁어옴
            File file = new File("C:\\test1\\" + filename);
            input = new FileInputStream(file);
            output = new FileOutputStream(new File("C:\\test2\\" + filename));

            int readBuffer = 0;
            byte [] buffer = new byte[512];
            while((readBuffer = input.read(buffer)) != -1) {
                output.write(buffer, 0, readBuffer);
            }
            // 파일 복사 완료

            bow.write("C:\\test2\\ 위치에 " + filename + "파일 복사 완료" +"\n");
            bow.flush();


            serverSocket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
