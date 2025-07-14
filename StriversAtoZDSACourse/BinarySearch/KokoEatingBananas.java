package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {

    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }
    public static int minBananasPerHour(int[] arr, int h){
        int low = 1;
        int high = findMax(arr);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(totalHours(arr, mid) <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int totalHours(int[] arr, int bananas){
        int totalHours = 0;
        for(int pile : arr){
            totalHours += (int) Math.ceil((double)pile/(double)bananas);
        }
        return totalHours;
    }

    public static void main(String[] args) {
        int[] arr = {7,15,6,3};
        int h = 8;
        System.out.println(minBananasPerHour(arr, h));
    }
}
