package day05;

public class ExceptionMain {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            exceptionTest.method01(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누지 마");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 크기 2넘으면 안됨");
        }
    }
}
