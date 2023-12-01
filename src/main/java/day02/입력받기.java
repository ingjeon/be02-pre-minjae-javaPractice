package day02;

import java.util.Scanner;

public class 입력받기 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        
        System.out.print("글자만 입력 : ");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);

        System.out.print("숫자만 입력 : ");
        int inputNum = sc.nextInt();
        System.out.println(inputNum);
        
    }
}
