package day02;

import java.util.Arrays;

/** 로또 번호 생성 1~45 중복 없이 6개
 *  변수 , 조건문, 반복문, 배열만 사용
 */
public class Ex08 {
    public static void main(String[] args) {
        boolean check = true;
        Integer[] answer = new Integer[6];
        // TODO 첫번째 생성
        answer[0] = (int)(Math.random()*45) + 1;
        Integer i = 1;
        while(check) {
            //TODO i 인덱스로 두번째부터 6번쨰 생성
            answer[i] = (int)(Math.random()*45) + 1;
            //TODO 번호가 중복인지 c 인덱스로 검사
            Integer c = 1;
            for(Integer n = 0; n < answer.length; n = n + 1) {
                if (answer[n] != answer[i]) {
                    c = c + 1;
                }
            }
            //TODO 검사 통과하면 i + 1
            if(c == answer.length) {
                i = i + 1;
                //TODO 6개 다만들면 탈출
                if(i == 6) {
                    check = false;
                }
            }
        }
        for(Integer k = 0; k < 6; k = k + 1) {
            System.out.println(answer[k]);
        }
        System.out.println(Arrays.toString(answer));
    }
}
