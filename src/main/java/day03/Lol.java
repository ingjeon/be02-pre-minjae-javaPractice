package day03;

public class Lol {
    public static void main(String[] args) {
        System.out.println("챔피언 객체 생성 전");
        Champion garen = new Champion(
                "가렌",72,
                100,580,60,
                1,0,0,0,new String[6]);
        System.out.println("챔피언 객체 생성 후");
        // todo  사실 이렇게 .hp 접근해서 보여주는거 좋지않음
        //  public 객체. 접근 못하게 하는게 좋음.
        //  메소드를 통해서만 접글할 수 있게
        System.out.println(garen.hp);


        System.out.println("챔피언 객체 생성 전");
        Champion darius = new Champion(
                "다리우스",64,
                175,652,39,
                1,0,0,0,new String[6]);
        System.out.println("챔피언 객체 생성 후");
        System.out.println(darius.hp);

        //todo 다리가 가렌 공격 가렌체력 출력
        for (int i =0; i < 4; i++) {
            darius.attackTo(garen);
            System.out.println(garen.hp);
        }
        System.out.println(darius.name + " " + darius.hp);
        System.out.println("toString : " + darius.toString());

        Champion jinx = new Champion("징크스");

        Champion katalina = new Champion(400);

        jinx.move(20,10);
        katalina.move(20,10);

        Tristana tristana =  new Tristana("트리스타나",0);
        tristana.move(10, 20);
        tristana.jump();


    }
}
