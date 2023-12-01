package day03;

public class Tristana extends Champion {
    Integer z;

    void jump(){
        z = z + 10;
    }

    public Tristana(String name, Integer attackDamage, Integer attackRange, Integer hp, Integer defence, Integer level, Integer exp, Integer x, Integer y, String[] itemList, Integer z) {
        super(name, attackDamage, attackRange, hp, defence, level, exp, x, y, itemList);
        this.z = z;
    }

    Tristana(String name, Integer z) {
        super(name);
        this.z = z;
    }

    Tristana(Integer hp) {
        super(hp);
    }
}
