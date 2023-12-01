package day03;

public class Student {
    String name;
    Integer age;
    String gender;
    Integer fullness;
    Integer intellgence;

    Integer eating(String menu, Integer amount) {
        fullness = fullness + amount;
        return fullness;
    }

    Integer studying(String subject, Integer time) {
        intellgence = intellgence + 2 * time;
        return intellgence;
    }
    
    void goHome() {
        System.out.println("집가자");
    }
}
