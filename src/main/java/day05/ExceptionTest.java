package day05;

public class ExceptionTest {
    int method01(int num1, int num2) throws ArithmeticException, IndexOutOfBoundsException {
        int result = 0;
        int[] arr = new int[3];

        // arr[3] = 10;  // IndexOutOfBoundsException e

        result = num1 / num2;  // ArithmeticException e

        return result;
    }
}
