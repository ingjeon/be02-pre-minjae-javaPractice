package day02;

public class Ex01 {
    public static void main(String[] args) {
        // 총합 저장할 변수
        Integer sum = 0;
        // 1~ 100 까지 더하기
        for(Integer i = 1; i < 101; i = i + 1) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
