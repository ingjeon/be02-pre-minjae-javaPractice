package day02;

public class ExEqual {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        Integer c;
        c = new Integer(1);
        if(a == b) {
            System.out.println("b equal");
        }
        if(a == c) {
            System.out.println("c equal");
        }
        String str1 = "=";
        String str2 = new String("=");
        if(str1 == "=") {
            System.out.println("str1 equal");
        }
        if(str2 == "=") {
            System.out.println("str2 equal");
        }
        //TODO int Integer
        // 배열, 열거, 클래스, 인터페이스 => 참조 타입
        // 기본타입 과 다름
        // 래퍼 ? 언박싱? 추가 정리
    }
}
