package day02;

public class Ex08_2 {
    public static void main(String[] args) {

        //todo 일단 생성 후 검사
        int lotto [] = new int[6];
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45) + 1;
        }
        //todo flag 시작하자 마자 false 생각도 못함
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (lotto[i] == lotto[j]) {
                        lotto[i] = (int) (Math.random() * 45) + 1;
                        i = 0;
                        flag = true;
                    }
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(" " + lotto[i]);
        }

    }
}


