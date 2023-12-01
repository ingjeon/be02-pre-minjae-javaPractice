package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 숫자를 입력받을 크기가 10인 배열
        Integer[] arr1 = new Integer[10];

        // 0 ~9 까지 반복
        //  배열의 반복 횟수 번째에 숫자를 입력받아서 저장
        for(Integer i = 0; i < arr1.length; i = i + 1) {
            System.out.print("숫자만 입력하시오 : ");
            arr1[i] = sc.nextInt();
        }

        // 모든 수를 저장할 변수를 생성
        // 0 ~9 까지 반복
        //  모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        Integer sum = 0;
        for(Integer i = 0; i < arr1.length; i = i + 1) {
            sum = sum + arr1[i];
        }
        //모든 수를 저장 한 변수에 배열의 크기만큼 나누어서 출력
        System.out.println(sum/ arr1.length);


    }
}
