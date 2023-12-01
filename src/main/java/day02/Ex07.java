package day02;

import java.util.Scanner;

// 정수로 된 돈의 액수를 입력받아
// 오만원권,만원권,오천원권,천원권, 500원짜리,100원,50원,10원,1원
// 각 몇개씩 변환 될까?
public class Ex07 {
    public static void main(String[] args) {
        // unit 배열 활용
        int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
        // 정수 입력받고 저장
        Scanner sc = new Scanner(System.in);
        Integer money = sc.nextInt();
        // 몫 나머지 분리해서 연사 진행
        Integer[] num = new Integer[unit.length];
        Integer[] moneyTmp = new Integer[unit.length];
        num[0] = money / unit[0];
        moneyTmp[0] = money % unit[0];
        for(Integer i = 0; i < unit.length - 1; i = i + 1) {
            num[i + 1] = moneyTmp[i] / unit[i + 1];
            moneyTmp[i + 1] = moneyTmp[i] % unit[i + 1];
        }
        // 출력
        for(Integer i = 0; i < unit.length; i = i + 1)  {
            System.out.println(unit[i] + "원 " + num[i] + "개");
        }

        // Todo 선생님 간단하게
        for(Integer i = 0; i < unit.length; i = i + 1) {
            System.out.println(unit[i] + "원 " + money / unit[i] + "개");
            money = money % unit[i];
        }
    }
}
