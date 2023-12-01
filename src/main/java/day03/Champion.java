package day03;

import java.util.Arrays;

public class Champion {
    String name;
    Integer attackDamage;
    Integer attackRange;
    Integer hp;
    Integer defence;
    Integer level;
    Integer exp;
    Integer x;
    Integer y;
    String[] itemList;

    //todo toString : day03.Champion@79698539
    // 위에를 밑에 처럼 나오게 수정하기 (자바 toString 상속)
    // toString : Champion{name='다리우스', attackDamage=64,
    // attackRange=175, hp=652, defence=39, level=1, exp=0,
    // x=0, y=0, itemList=[빈칸, 빈칸, 빈칸, 빈칸, 빈칸, 빈칸]}
    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", attackDamage=" + attackDamage +
                ", attackRange=" + attackRange +
                ", hp=" + hp +
                ", defence=" + defence +
                ", level=" + level +
                ", exp=" + exp +
                ", x=" + x +
                ", y=" + y +
                ", itemList=" + Arrays.toString(itemList) +
                '}';
    }

    public Champion(String name, Integer attackDamage, Integer attackRange, Integer hp, Integer defence, Integer level, Integer exp, Integer x, Integer y, String[] itemList) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.hp = hp;
        this.defence = defence;
        this.level = level;
        this.exp = exp;
        this.x = x;
        this.y = y;
        this.itemList = itemList;
        for (int i = 0; i < this.itemList.length; i++) {
            this.itemList[i] = "빈칸";
        }
    }

    Champion(String name){
        this.name = name;
    }

    Champion(Integer hp){
        this.hp = hp;
    }


    //todo 메소드\
    Integer levelUp() {
        level = level + 1;
        // todo * 1.1   정수 타입 문제 => * 11 / 10
        attackDamage = attackDamage * 110 / 100;
        defence = defence * 105 / 100;
        hp = hp * 120 / 100;
        return level;
    }

    Integer expUp(String enemy) {
        if(enemy.equals("미니언")) {
            exp = exp + 10;
        } else if(enemy.equals("용")) {
            exp = exp + 50;
        } else if(enemy.equals("타워")) {
            exp = exp + 100;
        }

        if(exp >= 100) {
            //todo .expUp()을 사용했을때 객체 불러왔음
            //  this.levelUp 에서 this. 생략된거
            // levelUp에서 level, attackDamage, defence, hp
            // expUp에서  exp, levelUp()  전부 this. 생략된거
            this.levelUp();
            exp = exp - 100;
        }
        return exp;
    }
    //todo this 없어도 알아서 하다가 매개변수x와 객체의x
    // 이름과 같아서 수동해야함
    void move(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    void recall(){
        this.x = 0;
        this.y = 0;
    }
    void recall(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    String[] shopping(String item) {
        for (int i=0; i<this.itemList.length; i++) {
            if(this.itemList[i].equals("빈칸")) {
                this.itemList[i] = item;
                break;
            }
        }

        return itemList;
    }

    void die() {
        this.recall();
        this.hp = 100;
    }

    Integer attacked(Integer attackDamage) {
        this.hp = this.hp - attackDamage;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }
    Integer attacked(Integer attackDamage, Integer num) {
        this.hp = this.hp - attackDamage * num;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }

    void attackTo(Champion target) {
        Integer random = (int)(Math.random() * 100) + 1;
        if (random >= 90) {
            target.attacked(this.attackDamage ,3);
        } else if (random >= 80) {
            target.attacked(this.attackDamage, 2);
        } else {
            target.attacked(this.attackDamage);
        }
        target.attacked(this.attackDamage);
    }

}

