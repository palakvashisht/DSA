package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class SplitArrayOrPaintersPartition {
    public static int splitArrayPartition(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low <= high){
            int mid = low + (high - low)/2;
            if(splitArray(arr, mid) > k){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int splitArray(int[] arr, int mid) {
        int countOfSubArrays = 1;
        int count = 0;
        for(int element : arr){
            if(count + element <= mid){
                count += element;
            }else {
                countOfSubArrays++;
                count = element;
            }
        }
        return countOfSubArrays;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        System.out.println(splitArrayPartition(arr, k));
    }
}
