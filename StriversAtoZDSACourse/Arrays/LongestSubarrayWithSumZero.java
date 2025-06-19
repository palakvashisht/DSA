package StriversAtoZDSACourse.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumZero {

    public static int longestSubarrayWithSumZero(int[] arr){
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> elementAndIndex = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(sum == 0){
                maxLength = i+1;
            }else {
                if(elementAndIndex.containsKey(sum)) {
                    maxLength = Math.max(maxLength, i - elementAndIndex.get(sum));
                }else{
                    elementAndIndex.put(sum, i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(longestSubarrayWithSumZero(arr));
    }
}
