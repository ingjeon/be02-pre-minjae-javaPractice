package day02;

public class Ex05 {
    public static void main(String[] args) {

        // 숫자를 입력받을 크기가 10인 배열
        Integer[] arr1 = new Integer[10];

        // 0 ~9 까지 반복
        //  배열의 반복 횟수 번째에 1~10까지 랜덤 숫자를 생성 저장
        for(Integer i = 0; i < arr1.length; i = i + 1) {
            arr1[i] = (int)(Math.random()*10) + 1;
        }

        // 모든 수를 저장할 변수를 생성
        // 0 ~9 까지 반복
        //  모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        Integer sum = 0;
        for(Integer i = 0; i < arr1.length; i = i + 1) {
            sum = sum + arr1[i];
        }
        //모든 수를 저장 한 변수에 배열의 크기만큼 나누어서 출력
        System.out.println(sum);


    }
}
