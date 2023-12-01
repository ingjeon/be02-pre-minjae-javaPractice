package day03;

public class Child extends Parents{
    String car;

    public Child(String car) {
        this.car = car;
    }

    @Override
    void shopping(String item) {
        super.shopping(item);
        money = money * 2;
    }
}
