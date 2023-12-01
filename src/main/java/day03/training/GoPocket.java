package day03.training;

public class GoPocket {
    public static void main(String[] args) {
        Pocket ele1 = new Pocket("피카츄",1,11,50,
                4,"전기",0,0);
        System.out.println("toString : " + ele1.toString());
        Pocket ele2 = new Pocket("라이츄",1,0,75,
                6,"전기",0,0);
        System.out.println("toString : " + ele2.toString());
        Pocket fire1 = new Pocket("파이리",1,0,50,
                4,"불",0,0);
        System.out.println("toString : " + fire1.toString());
        Pocket water1 = new Pocket("꼬부기",1,0,50,
                4,"물",0,0);
        System.out.println("toString : " + water1.toString());
        Pocket water2 = new Pocket("야도란",1,0,100,
                5,"물",0,0);
        System.out.println("toString : " + water2.toString());
        PocketAirType air1 = new PocketAirType("버터풀",1,0,40,
                5,"바람",0,0,1);
        System.out.println("toString : " + air1.toString());
        PocketAirType air2 = new PocketAirType("피죤투",1,0,100,
                7,"바람",0,0,1);
        System.out.println("toString : " + air2.toString());
        PocketAirType air3 = new PocketAirType("또가스",1,0,55,
                4,"바람?",0,0,1);
        System.out.println("toString : " + air3.toString());


        for (int i =0; i < 11; i++) {
            air2.attackTo(ele1);
            System.out.println("남은 "+ele1.getHp());
        }

        for (int i =0; i < 9; i++) {
            air2.attackTo(air1);
            System.out.println("남은 "+air1.getHp());
        }

        air2.fly();
        System.out.println("toString : " + air2.toString());
        air2.land();
        System.out.println("toString : " + air2.toString());
    }
}
