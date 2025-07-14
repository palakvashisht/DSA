package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class FindTheSmallestDivisorGivenAThreshold {

    public static Boolean isWithinThreshold(int[] arr, int threshold, int mid){
        int count = 0;
        for(int num : arr){
            count += (int) Math.ceil((double)num/(double)mid);
        }
        return count <= threshold;
    }

    public static int findTheSmallestDivisorGivenAThreshold(int[] arr, int threshold){
        if(arr.length > threshold)
            return -1;
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int smallestDivisor = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(!isWithinThreshold(arr, threshold, mid)){
                low = mid + 1;
            }else{
                smallestDivisor = Math.min(smallestDivisor, mid);
                high = mid - 1;
            }
        }
        return smallestDivisor;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int threshold = 8;
        System.out.println("Smallest divisor is "+findTheSmallestDivisorGivenAThreshold(arr, threshold));

    }
}
