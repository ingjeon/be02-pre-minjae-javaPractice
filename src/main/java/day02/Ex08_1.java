package day02;

public class Ex08_1 {
    public static void main(String[] args) {
        //Todo 45개 만들고 섞고 앞에 6개
        int lotto [] = new int[45];
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = i + 1;
        }
        //Todo 섞는 횟수
        for(int i = 0; i < 100; i++){
            int j = (int)(Math.random()*lotto.length);
            int std = lotto[0];
            lotto[0] = lotto[j];
            lotto[j] = std;
        }

        for (int i = 0; i < 6; i++){
            System.out.println(lotto[i] + " ");
        }

    }
}


