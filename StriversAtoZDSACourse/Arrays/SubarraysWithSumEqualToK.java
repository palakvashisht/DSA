package StriversAtoZDSACourse.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumEqualToK {
    /*public static int countTheSubarrays(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        int i = 0, j = 0;
        while (j < arr.length){
            sum += arr[j];
            if(sum == k){
                count++;
                sum = 0;
                i++;
            }else if(sum < k){
                j++;
            }else{
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return count;
    }*/

    public static int countTheSubarrays(int[] arr, int k){
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i : arr){
            prefixSum += i;
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(countTheSubarrays(arr, k));
    }
}
