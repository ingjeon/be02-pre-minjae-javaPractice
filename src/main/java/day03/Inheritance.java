package day03;

public class Inheritance {
    public static void main(String[] args) {
        Parents parents = new Parents();
        Child child = new Child("k5");

        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);

        parents.shopping("63빌딩");
        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);

        child.shopping("64빌딩");
        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);
    }
}
