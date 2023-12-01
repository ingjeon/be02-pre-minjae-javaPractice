package day03.book;

public class BookTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("toString : " + car1.toString());
        Car car2 = new Car("자가용");
        System.out.println("toString : " + car2.toString());
        Car car3 = new Car("자가용", "빨강");
        System.out.println("toString : " + car3.toString());
        Car car4 = new Car("택시","검정",200);
        System.out.println("toString : " + car4.toString());

        Board b1 = new Board("제목","내용");
        System.out.println("toString : " + b1.toString());

    }
}
