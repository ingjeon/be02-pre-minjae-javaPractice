package day02;

public class Ex02 {
    public static void main(String[] args) {
        // 총합 저장할 변수
        Integer sum = 0;
        // i 1~ 100 까지 1씩 증가 하면서 i가 홀수면 더하기
        for(Integer i = 1; i < 101; i = i + 1) {
            if(i%2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        // 다른 방법
        sum = 0;
        for(Integer i = 1; i < 101; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
