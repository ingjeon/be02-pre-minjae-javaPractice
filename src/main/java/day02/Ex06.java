package day02;

import java.util.Scanner;

// 배열에 월~일까지 초기화 0~6 부터 숫자를 입력받아 입력한 숫자와같은
// 인덱스에 있는 요일을 출력하고 범위에 없는 숫자=> "잘못 입력하셨습니다"
public class Ex06 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 월~일 저장할 배열 만들기
        // 배열에 월~일 저장
        //String[] days = new String[7];
        //days[0] = "Mon";
        String[] week = {"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};

        // 숫자 입력 받을 변수 생성
        // 숫자를 입력받아 변수에 저장
        // 만약 0~6이면
        //  배열 인덱스 값 출력
        // else
        //  잘못 입력하셨습니다
        System.out.print("0~6 까지 정수를 입력하세요 : ");
        Integer inputNum = sc.nextInt();
        if(inputNum >= 0 && inputNum <= 6){
            System.out.println(week[inputNum]);
        }
//        if(inputNum == 0 || inputNum == 1 || inputNum == 2
//                || inputNum == 3 || inputNum == 4
//                || inputNum == 5 || inputNum == 6) {
//            System.out.println(week[inputNum]);
//        }     // 애초에 스캔 받을때 Integer... 아쉬운 생각
        else {
            System.out.println("잘못 입력하셨습니다");
        }
    }
}
