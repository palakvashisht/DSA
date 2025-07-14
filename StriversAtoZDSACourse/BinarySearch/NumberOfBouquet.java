package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;
import java.util.Optional;

public class NumberOfBouquet {
    public static int daysRequiredToFormNumberOfBouquets(int[] arr, int m, int k){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        if(n < (m * k)){
            return -1;
        }
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();
        while(low <= high){
            int mid = low + (high-low)/2;
            if(!possibleOrNot(arr,mid,m,k)){
                low = mid + 1;
            }else{
                ans = Math.min(ans, mid);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static Boolean possibleOrNot(int[] arr, int mid, int m, int k){
        int count = 0;
        int noOfBouquets = 0;
        for (int bloomingDay : arr){
            if(mid >= bloomingDay){
                count++;
            }else{
                noOfBouquets += count/k;
                count = 0;
            }
        }
        noOfBouquets += count/k;
        return noOfBouquets >= m;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println("Min days to form "+m+" bouquets with "+k+" flowers are :"+daysRequiredToFormNumberOfBouquets(arr,m,k));
    }
}
