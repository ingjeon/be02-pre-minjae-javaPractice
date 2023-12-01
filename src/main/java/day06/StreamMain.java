package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("c:\\test\\pic1.png");
            fileOutputStream = new FileOutputStream("c:\\test\\pic2.png");

            byte[] bytes = fileInputStream.readAllBytes();

            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("error1");
        } catch (IOException e) {
            System.out.println("error2");
        } finally {
            if(fileInputStream != null) {
                fileInputStream.close();
            }
            if(fileOutputStream != null) {
                fileInputStream.close();
            }
        }




    }
}
