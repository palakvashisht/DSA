package StriversAtoZDSACourse.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountTheSubarraysWithXorK {
    public static int countTheSubarraysWithXorK(int[] arr, int k){
        Map<Integer, Integer> prevXor = new HashMap<>();
        int n = arr.length;
        int count = 0;
        int xr = 0;
        prevXor.put(0,1);
        for(int i = 0; i < n ; i++){
            xr = xr^arr[i];
            int x = xr ^ k;
            if(prevXor.containsKey(x)){
                count += prevXor.getOrDefault(x, 0);
            }else{
                prevXor.put(xr, prevXor.getOrDefault(xr, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int k = 5;
        System.out.println(countTheSubarraysWithXorK(arr, k));
    }
}
