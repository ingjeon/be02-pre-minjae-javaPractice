package day03.book;

public class Car {
    String company ="현대";
    String model;
    String color;
    int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    Car(){
    }
    Car(String model){
        this(model,"은색",250);
    }
    Car(String model, String color){
        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
