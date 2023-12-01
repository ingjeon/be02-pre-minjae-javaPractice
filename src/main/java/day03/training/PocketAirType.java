
package day03.training;

public class PocketAirType extends Pocket {
    Integer z;



    @Override
    public String toString() {
        return "비행포켓몬{" +
                "z=" + z +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", hp=" + getHp() +
                ", attackDamage=" + attackDamage +
                ", type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public PocketAirType(String name, Integer level, Integer exp,
                         Integer hp, Integer attackDamage, String type,
                         Integer x, Integer y, Integer z) {
        //todo super() 부모 클래스의 생성자 호출
        super(name, level, exp, hp, attackDamage, type, x, y);
        this.z = z;
    }

    @Override
    Integer attacked(Integer attackDamage, Integer num) {
        if(z==0) {
            //todo super. 부모 객체를 의미
            super.attacked(attackDamage, num);
        } else {
            System.out.println("느려!");
        }
        return this.getHp();
    }

    void fly(){
        if(z < 10) {
            System.out.println("비행! 뿅!");
            this.z = this.z + 10;
            super.x = super.x + (int)(Math.random() * 5) - 2;
            super.y = super.x + (int)(Math.random() * 5) - 2;
        }
    }

    void land() {
        System.out.println("착륙! 여긴 어디?");
        z = z - 10;
    }
}
