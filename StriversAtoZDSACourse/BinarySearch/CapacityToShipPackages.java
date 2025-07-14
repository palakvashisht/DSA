package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class CapacityToShipPackages {
    public static Boolean findDays(int[] arr, int limit, int mid){
        int sum = 0;
        int days = 1;
        Boolean areDaysInLimit = Boolean.FALSE;
        for(int num : arr){
            sum += num;
            if(sum > mid){
                days++;
            }
            if(days > limit){
                return Boolean.FALSE;
            }else{
                areDaysInLimit = Boolean.TRUE;
            }
        }
        return areDaysInLimit;
    }

    public static int findTheMinimumCapacity(int[] arr, int days){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int minCapacity = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(!findDays(arr, days,mid)){
                low = mid + 1;
            }else{
                minCapacity = Math.min(minCapacity, mid);
                high = mid - 1;
            }
        }
        return minCapacity;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = findTheMinimumCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
