package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsNBy3 {

    public static List<Integer> findMajorityElements(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> majorityElements = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ; i<n; i++){
            map.compute(arr[i],(key, val) -> (val == null) ? 1 : val + 1);
            if(map.get(arr[i]) > n/3){
                majorityElements.add(arr[i]);
            }
        }
        return majorityElements;
    }

    public static List<Integer> optimalFindTheMajorityElement(int[] arr){
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int ct1 = 0, ct2 = 0;
        int n = arr.length;
        List<Integer> elements = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            if(ct1 == 0 && el2 != arr[i]){
                el1 = arr[i];
                ct1 = 1;
            } else if (ct2 == 0 && el1 != arr[i]) {
                el2 = arr[i];
                ct2 = 1;
            } else if(el1 == arr[i]) {
                ct1++;
            } else if(el2 == arr[i]) {
                ct2++;
            } else{
                ct1--;
                ct2--;
            }
        }

        ct1 = 0;
        ct2 = 0;

        for(int i = 0 ; i < n; i++){
            if(arr[i] == el1){
               ct1++;
            }else if(arr[i] == el2){
                ct2++;
            }
        }

        if(ct1 > n/3){
            elements.add(el1);
        }
        if(ct2 > n/3){
            elements.add(el2);
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] arr = {11,33,33,11,33,44,44};
        List<Integer> majority = optimalFindTheMajorityElement(arr);
        for (int element : majority){
            System.out.println(element);
        }
    }
}
