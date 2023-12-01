package day08;


import java.util.*;

public class Programmers {
    public static void main(String[] args) {

        Solution a = new Solution();

//        int[][] arr1 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        int[] arr2 = {1, 2, 3, 4};
        String[] arr3 = {"0123456789", "9876543210", "9999999999999"};

//        System.out.println(Arrays.toString(a.solution(arr1)));
        System.out.println(Arrays.toString(a.solution(arr3,50000,5,5)));
//        System.out.println(Arrays.toString(a.solution(2,5)));
//        System.out.println(Arrays.toString(a.solution(-10000000,2)));
//        System.out.println(a.solution(10));

    }
}




class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            Integer num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if( k < num) list1.add(num);
        }
        return list1.isEmpty() ? new int[] { -1 } : list1.stream().mapToInt(i -> i).toArray();
    }
}