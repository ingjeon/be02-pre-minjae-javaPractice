package day04.game;

public class GamePlayer {
    String name;
    Integer hp;
    Integer score;


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", score=" + score +
                '}';
    }

    public GamePlayer(String name) {
        this.name = name;
        this.hp = 5;
        this.score = 0;
    }

}
