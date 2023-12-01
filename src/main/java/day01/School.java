package day01;

class School {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        // 객체를 저장할 수 있는 변수 생성
        // 클래스 종류와 이름만 선언
        Student kty;

        // 앞에서 만든 변수에 new로 객체를 생성해서  = 으로 저장
        // 초기값, 최초 저장될 때 변수 초기화 => 메모리 번지 정보 갖음
        kty = new Student();
        kty.age = 26;
        kty.name = "김태윤";
        kty.major = true;



        Student yhd;
        yhd = new Student();

        // 객체 안에 있는 변수, 메소드를 사용할 때는 변수이름 다음 . 사용
        yhd.age = 31;
        yhd.name = "유형도";

        Student kkm;
        kkm = new Student();
        kkm.age = 27;
        kkm.name = "김경미";
        kkm.major = false;

        // 산술 연산자
        Integer result;
        result = kty.age + yhd.age; // 57
        System.out.println(result);
        result = kty.age - yhd.age; // -4
        System.out.println(result);
        result = kty.age * yhd.age; // 806
        System.out.println(result);
        result = kty.age / yhd.age; // 0, 몫만 나옴
        System.out.println(result);
        result = kty.age % yhd.age; // 26
        System.out.println(result);


        // 괄호 -> 산술 -> 비교 -> 논리 -> 대입

        // 비교연산자
        Boolean result2;
        result2 = kty.age > yhd.age;
        System.out.println(result2);
        result2 = kty.age >= yhd.age;
        System.out.println(result2);
        result2 = kty.age < yhd.age;
        System.out.println(result2);
        result2 = kty.age <= yhd.age;
        System.out.println(result2);
        result2 = kty.age == yhd.age;
        System.out.println(result2);
        result2 = kty.age != yhd.age;
        System.out.println(result2);

        // 논리 연산자 &&(곱셈 같은 애), ||(덧셈 같은 애)
        //  연산      결과
        // f && f       f
        // f && t       f
        // t && f       f
        // t && t       t

        //  연산      결과
        // f || f       f
        // f || t       t
        // t || f       t
        // t || t       t
        result2 = kty.age == yhd.age && kty.age <= yhd.age;

        Lecture linux;
        linux = new Lecture();
        linux.name = "리눅스 기초";
        linux.time = 2;

        Lecture db;
        db = new Lecture();
        db.name = "데이터 베이스";
        db.time = 8;

        Lecture softwareEngineering;
        softwareEngineering = new Lecture();
        softwareEngineering.name = "소프트웨어 공학";
        softwareEngineering.time = 3;





    }
}