package day07.chat;

import java.io.*;
import java.net.Socket;

public class MessageProcessThread extends Thread {
    Socket socket;
    // 생성자로 소켓 받아오기
    public MessageProcessThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 받는 코드 message readLine 까지
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);
            while (true) {
                String message = bir.readLine();
                System.out.println(message);

                for (int i = 0; i < MultiThreadServer.socketList.size(); i++) {
                    Socket client = MultiThreadServer.socketList.get(i);
                    // 보내는 코드 5줄 data readLine 까지
                    OutputStream os = client.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);
                    bw.write(message+"\n");
                    bw.flush();
                    //
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
