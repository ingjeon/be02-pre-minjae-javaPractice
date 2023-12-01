package day01;

public class ForWhilePractice {
    public static void main(String[] args) {
        Integer num1;
        num1 = 10;

        // 만약에 num1이 5보다 크면
        // "크다"를 출력
        // num1에 1을 빼고 결과를 num1에 저장한다.
        // 반복한다.
        while(num1 > 5){
            System.out.println("크다");
            // 조건을 변경시키는 코드
            num1 = num1 - 1;
        }

        // i가 0부터 i를 1씩 증가시키면서 10보다 작으면
        // 반복할 코드를 반복한다.
        for(Integer i=0; i<10; i = i + 1) {
            System.out.println("반복할 코드");
        }


    }
}
