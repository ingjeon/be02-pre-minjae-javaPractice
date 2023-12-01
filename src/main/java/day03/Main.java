package day03;

public class Main {
    public static void main(String[] args) {
        Student yhs;
        yhs = new Student();

        yhs.name = "양호신";
        yhs.age = 25;
        yhs.gender = "남자";
        yhs.fullness = 50;
        yhs.intellgence = 10;

        Integer result = yhs.studying("자료 구조", 4);

        yhs.goHome();
    }
}
