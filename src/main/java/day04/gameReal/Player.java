package day04.gameReal;

public class Player {
    private String name;
    private int  heart;
    private static int score;

    public Player(String name) {
        this.name = name;
        this.heart = 5;
        this.score = 0;
    }

    public void jeongdap() {
        this.score = this.score + 1;

        System.out.print("현재 점수 : ");
        System.out.println(this.score);
    }

    public void kkoang() {
        if(this.heart > 0 ) {
            this.heart = this.heart - 1;
        }
        System.out.print("현재 하트 : ");
        System.out.println(this.heart);
    }

    public String getName() {
        return name;
    }

    public void poktan() {
        this.kkoang();
        if(this.score > 0 ) {
            this.score = this.score - 1;
        }
        System.out.print("현재 점수 : ");
        System.out.println(this.score);
    }

    public int getHeart() {
        return heart;
    }

    public int getScore() {
        return score;
    }
}
