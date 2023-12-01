package day02;

public class Ex08_3 {
    public static void main(String[] args) {
        //todo 만들면서 검사
        // 로또번호자동 생성기
        // 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성
        int lotto[] = new int[6];
        for(int i = 0; i < lotto.length; i++){
            int randomNum = (int)(Math.random()*45) + 1;

            for(int j = 0; j < i; j++){
                if(lotto[j] == randomNum ) {
                    randomNum = (int)(Math.random()*45) + 1;
                    j = -1;
                }
            }
            lotto[i] = randomNum;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(" " + lotto[i]);
        }

    }
}


