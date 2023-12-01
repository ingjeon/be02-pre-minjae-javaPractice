package day04.game;

public class GoGame {
    public static void main(String[] args) {
        GamePlayer p1 = new GamePlayer("1번유저");
        GamePlayer p2 = new GamePlayer("2번유저");
        System.out.println("toString : 1" + p1.toString());
        System.out.println("toString : 2" + p2.toString());

        //todo 3점 이상 되면 게임 클리어
        // p1,p2 하트 모두 0 => 게임 오버
        while(true) {
            //todo 인덱스 0정답(1), 1꽝(0), 2폭탄(-1)
            Integer[] arr = {1,0,-1};
            //todo 5번 섞기
            for(int i = 0; i < 5; i++){
                int j = (int)(Math.random()*3);
                int std = arr[0];
                arr[0] = arr[j];
                arr[j] = std;
            }
            //todo 하트 0 아니면 점수 계산
            if(p1.hp > 0) {
                p1.score = p1.score + arr[0];
                //todo 정답이 아니면 (꽝,폭타) 하트 - 1
                if(arr[0]!=1) {
                    p1.hp = p1.hp - 1;
                }
            }
            //todo 결과 출력
            System.out.println(p1.name+" 하트 : "+p1.hp+" 점수: "+p1.score);

            if(p2.hp > 0) {
                p2.score = p2.score + arr[1];
                if(arr[1]!=1) {
                    p2.hp = p2.hp - 1;
                }
            }
            System.out.println(p2.name+" 하트 : "+p2.hp+" 점수: "+p2.score);


            //Todo 게임 결과 확인 후 조건 만족하면 exit
            if(p1.hp <= 0 && p2.hp <= 0) {
                System.out.println("**********************");
                System.out.println("게임 종료 둘다 집에 가라!!");
                System.out.println("**********************");
                System.exit(0);
            } else if(p1.score >= 3) {
                System.out.println("**********************");
                System.out.println("  "+p1.name+" 3점 달성 우승");
                System.out.println("**********************");
                System.exit(0);
            } else if(p2.score >= 3) {
                System.out.println("**********************");
                System.out.println("  "+p2.name+" 3점 달성 우승");
                System.out.println("**********************");
                System.exit(0);
            }
        }
    }
}
