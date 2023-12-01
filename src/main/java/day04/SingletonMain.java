package day04;

public class SingletonMain {
    public static void main(String[] args) {
        // 생성자에 private이 달려있어서 생성자를 실행 못함
        // Singleton singleton = new Singleton();
        Singleton var1 = Singleton.getInstance();
        Singleton var2 = Singleton.getInstance();
        Singleton var3 = Singleton.getInstance();
        Singleton var4 = Singleton.getInstance();
        Singleton var5 = Singleton.getInstance();
    }
}
