package day05;

import java.util.ArrayList;

public class tttt {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // 리스트에 값을 추가하는 법
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(1);
        System.out.println(arrayList);


        Integer nn = new Integer(1);

        arrayList.remove(nn); // OR  arrayList.remove(Integer.valueOf(1));
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

    }
}
