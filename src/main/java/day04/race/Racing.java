package day04.race;

import java.util.Arrays;
import java.util.Scanner;

public class Racing {
    public static void main(String[] args) {
        // 자동차 1칸 0칸 , 자동차 이름은 5칸 이하
        // 0~9 무작위 값  4이상이면 전진

        //todo 개수 입력 받음
        //  개수만큼  반복  이름 입력 받
        //  레이스 시도 입력 받음
        //  입력 받은 각 시도별 출력 결과
        //      pobi : --
        //      woni : ----
        //      jun : ---
        //  단독 우승자 안내
        //      최종 우승자 : pobi
        //  공동 우승자 안내
        //      최종 우승자 : pobi, jun

        Scanner sc = new Scanner(System.in);
        System.out.print("경주할 차 개수를 입력 해주세요 : ");
        int select = sc.nextInt();
        Car[] cars = new Car[select];
        System.out.println("총 "+select+"대 경주 진행 하겠습니다.");

        boolean flag = true;
        int n = 0;
        while(flag) {
            System.out.println("경주할 "+ (n+1) +"번 자동차 이름을 입력하세요.");
            String car = sc.next();// .next()  .nextLine() 무슨차이?
            if(car.length() > 5) {
                System.out.println("이름은 5자 이하만 가능합니다. 다시 입력하세요.");
            } else {
                cars[n] = new Car(car);
                n = n + 1;
            }
            if(n == select) flag = false;
        }
        System.out.println("총 "+select+"대 등록 완료");
        System.out.println(Arrays.toString(cars));
        System.out.print("시도할 회수는 몇 회 인가요? ");
        int count = sc.nextInt();
        System.out.println();
        System.out.println("*****총 "+count+"회 경주 시작*****");
        System.out.println("실행 결과");
        for(int i = 0; i < count; i = i + 1) {
            for(int j = 0; j < select; j = j + 1) {
                cars[j].carGo();
                System.out.print(cars[j].getName()+" : ");
                cars[j].carPlace();
                System.out.println();
            }
            System.out.println();
        }

        int tmp = 0;
        for(int i = 0; i < select; i = i + 1) {
            if(cars[i].getPlace() > tmp) {
                tmp = cars[i].getPlace();
            }
        }
        String str ="";
        for(int i = 0; i < select; i = i + 1) {
            if(cars[i].getPlace() == tmp) {
                str = str + ", " + cars[i].getName();
            }
        }
        System.out.print("최종 우승자 : ");
        System.out.println(str.substring(2));
        System.out.println("************************");
    }
}
