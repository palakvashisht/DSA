package StriversAtoZDSACourse.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static boolean linearSearch(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }

    public static int longestSequence(int[] arr){
        int n = arr.length;
        int maxLength = 0;
        int counter = 1;

        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }

        for (int element :  set){
            if(!set.contains(element-1)){
                while(linearSearch(arr, element+1)){
                    element++;
                    counter++;
                }
                maxLength = Math.max(maxLength, counter);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestSequence(arr));
    }
}
