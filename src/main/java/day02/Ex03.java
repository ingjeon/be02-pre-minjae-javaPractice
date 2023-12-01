package day02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 입력 받을 스캐너
        Scanner sc = new Scanner(System.in);

        // 숫자르 입력받을 크기가 6 인 배열 만들기
        Integer[] arr1 = new Integer[6];

        // 0부터 5까지 반복
        //  배열의 반복 횟수 번째에 숫자를 입력받아서 저장
        for(Integer i = 0; i < arr1.length; i = i + 1) {
            System.out.print("숫자만 입력하시오 : ");
            arr1[i] = sc.nextInt();
        }

        // 5부터 0까지 반복
        //  배열의 반복 횟수 번째에 숫자를 출력
        for(Integer i = 5; i >= 0; i = i - 1) {
            System.out.println(arr1[i]);
        }
    }
}
