package day04.card52;

public class Card {
    private int num;
    private String shape;
    private static int width;
    private static int height;

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", shape='" + shape + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public Card(int num, String shape, int width, int height) {
        this.num = num;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }
}

