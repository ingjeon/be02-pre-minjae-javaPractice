package day01;

public class IfPractice {
    public static void main(String[] args) {
        Integer num1;
        num1=10;
        Integer num2;
        num2=20;

        // 만약에 num1이 num2보다 작으면
        // "작다"고 출력한다.
        if(num1 < num2) {
            System.out.println("작다");
        }

        // 만약에 num1이 num2보다 작으면
        // "작다"고 출력한다.
        // 그렇지 않으면
        // "크거나 같다"고 출력한다.
        if(num1 < num2) {
            System.out.println("작다");
        }
        else {
            System.out.println("크거나 같다");
        }


        // 만약에 num1이 num2보다 작으면
        // "작다"고 출력한다.
        // 그렇지 않고 만약에 num1이 num2보다 크면
        // "크다"고 출력한다.
        // 그렇지 않으면
        // "같다"고 출력한다.
        if(num1 < num2) {
            System.out.println("작다");
        }
        else if(num1 > num2){
            System.out.println("크다");
        } else {
            System.out.println("같다");
        }
    }
}
