package day01;

public class Ex04 {
    public static void main(String[] args) {

        class RSP {
            Integer play123;
        }
        RSP Player01;
        Player01 = new RSP();

        RSP Player02;
        Player02 = new RSP();

        Boolean count = true;

        while(count){
            Player01.play123 = (int)(Math.random()*3) + 1;
            Player02.play123 = (int)(Math.random()*3) + 1;

            if(Player01.play123 == 1) {
                if(Player02.play123 == 1) {
                    System.out.print("다시\n");
                } else if(Player02.play123 == 2) {
                    System.out.print("Player02\n");
                    count = false;
                } else if(Player02.play123 == 3) {
                    System.out.print("Player01\n");
                    count = false;
                }

            } else if(Player01.play123 == 2) {
                if(Player02.play123 == 1) {
                    System.out.print("Player01\n");
                    count = false;
                } else if(Player02.play123 == 2) {
                    System.out.print("다시\n");
                } else if(Player02.play123 == 3) {
                    System.out.print("Player02\n");
                    count = false;
                }

            } else if(Player01.play123 == 3) {
                if(Player02.play123 == 1) {
                    System.out.print("Player02\n");
                    count = false;
                } else if(Player02.play123 == 2) {
                    System.out.print("Player01\n");
                    count = false;
                } else if(Player02.play123 == 3) {
                    System.out.print("다시\n");
                }
            }
        }
        // 1은 가위, 2는 바위, 3은 보
        
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복
    }
}
