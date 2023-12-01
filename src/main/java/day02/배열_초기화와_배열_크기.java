package day02;

public class 배열_초기화와_배열_크기 {
    public static void main(String[] args) {
        // 초기화 = 배열을 만들 때 값을 저장해서 만들 수 있다.
        int[] unit = {934,98,7251,2,92538,790,4149,50893,74498,9347,620493,78,6,239,4878,29043,863912,843,7389218,4372,730635};

        // 배열에 저장된 값 하나에 접근
        System.out.println(unit[0]);


        // 배열의 크기는 배열이 저장된 변수이름.length로 구할 수 있다.
        for(int i=0; i < unit.length; i++) {
            System.out.println(unit[i]);
        }
    }
}
