package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static int maxMinDistanceBetweenTwoCows(int[] arr, int cows){
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        while(low <= high){
            int mid = low + (high-low)/2;
            if(possibleToPlaceCows(arr, mid, cows)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static Boolean possibleToPlaceCows(int[] arr, int dist, int cows){
        int countCows = 1;
        int last = arr[0];
        boolean isPossible = Boolean.FALSE;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if(countCows >= cows){
                isPossible = Boolean.TRUE;
            }
        }
        return isPossible;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        Arrays.sort(arr);
        int cows = 4;
        System.out.println(maxMinDistanceBetweenTwoCows(arr, cows));
    }
}
