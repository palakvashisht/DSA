package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheLeaders {
    public static List<Integer> findAllTheLeaders(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
         for (int i = n-1; i >= 0; i--) {
             if(arr[i] > max){
                 max = arr[i];
                 list.add(max);
             }
         }
         return list;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(findAllTheLeaders(arr));
    }
}
