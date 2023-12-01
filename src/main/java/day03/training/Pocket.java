package day03.training;

public class Pocket {

    String name;
    Integer level;
    Integer exp;
    private Integer hp;
    Integer attackDamage;
    String type;
    Integer x;
    Integer y;


    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        if(hp>100) {
            hp = hp % 100;
        }
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "포켓몬{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", hp=" + hp +
                ", attackDamage=" + attackDamage +
                ", type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Pocket(String name, Integer level, Integer exp, Integer hp, Integer attackDamage, String type, Integer x, Integer y) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.type = type;
        this.x = x;
        this.y = y;
    }


    //todo 메소드\
    Integer levelUp() {
        level = level + 1;
        hp = hp * 122 / 100;
        attackDamage = attackDamage * 122 / 100;
        return level;
    }

    Integer expUp(String enemy) {
        if(enemy.equals("알통몬")) {
            exp = exp + 10;
        } else if(enemy.equals("근육몬")) {
            exp = exp + 22;
        } else if(enemy.equals("괴력몬")) {
            exp = exp + 50;
        }
        if(exp >= 100) {
            this.levelUp();
            exp = exp - 100;
        }
        return exp;
    }
    void die() {
        System.out.println("You Die");
        this.hp = 1;
    }
    void iAmHero() {
        System.out.println("                    피카츄는 쓰러지지 않아");
    }


    void attackTo(Pocket target) {
        System.out.println(this.name + "!   " + target.name +" 공격");
        Integer random = (int)(Math.random() * 3);
        if (random == 2) {
            target.attacked(this.attackDamage ,30);
            System.out.println("대성공 30% 추가 대미지");
        } else if (random == 1) {
            target.attacked(this.attackDamage, 10);
            System.out.println("성공 10% 추가 대미지");
        } else {
            target.attacked(this.attackDamage,-20);
            System.out.println("실패 20% 감소 대미지");
        }
    }

    Integer attacked(Integer attackDamage, Integer num) {
        this.hp = this.hp - attackDamage * (100+num) / 100;
        if(hp <= 0) {
            if(this.name.equals("피카츄")) {
                hp = 99;
                iAmHero();
            } else
                this.die();
        }
        return hp;
    }


}
