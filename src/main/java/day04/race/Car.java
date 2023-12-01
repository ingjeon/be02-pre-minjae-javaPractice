package day04.race;

public class Car {
    private String name;
    private Integer place;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public Car(String name) {
        this.name = name;
        this.place = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getPlace() {
        return place;
    }

    public void carGo() {
        int go = (int)(Math.random()*10);
        if(go >= 4) {
            this.place = this.place + 1;
        }
    }

    public void carPlace() {
        if(this.place != 0) {
            for(int i = 0; i < this.place; i = i + 1) {
                System.out.print("-");
            }
        }
    }
}
