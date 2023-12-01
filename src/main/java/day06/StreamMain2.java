package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamMain2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("c:\\test\\abc.txt");
            fileOutputStream = new FileOutputStream("c:\\test\\abc2.txt");

            int data = 0;

            while( (data = fileInputStream.read()) != -1) {
                System.out.print((char)data);
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
