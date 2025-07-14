package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class CapacityToShipPackages {
    public static int findDays(int[] arr, int limit, int mid) {
        int sum = 0;
        int days = 1;
        for (int num : arr) {
            if (sum + num > mid) {
                days++;
                sum = 0;
            }
            sum += num;
        }
        return days;
    }

    public static int findTheMinimumCapacity(int[] arr, int days){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low <= high){
            int mid = low + (high-low)/2;
            int daysToBeTaken = findDays(arr, days, mid);
            if(daysToBeTaken <= days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = findTheMinimumCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
