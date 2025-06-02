package StriversAtoZDSACourse.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ElementWithCountGreaterThanHalfN {

    public int elementWithCountGreaterThanHalfN(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) > n/2){
                return arr[i];
            }
        }
        return -1;
    }

    public int optimalApproach(int[] arr){
        int element = -1;
        int count = 0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                element = arr[i];
                count = 1;
            }else if(arr[i] == element){
                count++;
            }else{
                count--;
            }
        }

        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                count1++;
            }
        }
        if(count1 > n/2){
            return element;
        }
        return element;
    }

    public static void main(String[] args) {
        ElementWithCountGreaterThanHalfN e = new ElementWithCountGreaterThanHalfN();
        System.out.println(e.elementWithCountGreaterThanHalfN(new int[]{2,2,1,1,1,1}));
        System.out.println(e.optimalApproach(new int[]{2,2,1,1,1,1}));
    }
}
