package day04.card52;

public class CardMain {
    public static void main(String[] args) {
        Card heart01 = new Card(1, "하트", 50, 80);
        Card heart02 = new Card(2, "하트", 100, 160);

        System.out.println(heart01.toString());
        System.out.println(heart02.toString());

    }
}
