package day05;

import java.util.ArrayList;
import java.util.HashMap;

public class ColllectionTest {
    public static void main(String[] args) {
        // 나중에 문법 더 배우고 쓸 형태   (제네릭, 다형성)
        // List<Integer> integerList = new ArrayList<Integer>();

        ArrayList arrayList = new ArrayList();

        // 리스트에 값을 추가하는 법
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add(444);
        System.out.println(arrayList);


        // 리스트에서 원하는 위치의 값 가져오는 법
        System.out.println(arrayList.get(0));



        // 리스트에서 원하는 위치에 추가하는 법
        arrayList.add(0, "000");
        System.out.println(arrayList);

        // 리스트에서 원하는 값 찾아서 삭제, 여러개가 있으면 앞에서부터 찾아서 먼저 나오는 것만 삭제
        arrayList.remove("222");
        System.out.println(arrayList);

        // 리스트에서 원하는 위치에 있는 값 삭제
        arrayList.remove(0);
        System.out.println(arrayList);





        // 맵



        // 나중에 문법 더 배우고 쓸 형태
        // HashMap<String, String> hashMap = new HashMap<String, String>();


        HashMap hashMap = new HashMap();

        // 맵에 값을 추가하는  법
        hashMap.put("키1","값1");
        hashMap.put("키2","값2");
        hashMap.put("키3","값3");

        System.out.println(hashMap);


        // 맵에서 원하는 위치의 값 가져오는 법
        System.out.println(hashMap.get("키1"));

        // 맵에서 삭제하는 법
        hashMap.remove("키1");
        System.out.println(hashMap);



    }
}
