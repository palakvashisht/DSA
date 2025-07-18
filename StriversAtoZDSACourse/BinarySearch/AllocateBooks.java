package StriversAtoZDSACourse.BinarySearch;

import java.util.Arrays;

public class AllocateBooks {
    public static int allocateBooks(int[] arr, int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        if(arr.length < k){
            return -1;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canBeAllocatedBooks(arr, k, mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static boolean canBeAllocatedBooks(int[] arr, int k, int mid){
        int countOfStudents = 1;
        int noOfPages = 0;
        for(int i : arr){
            if(noOfPages + i <= mid){
                noOfPages += i;
            }else{
                noOfPages = i;
                countOfStudents++;
            }
        }
        return countOfStudents > k;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k =  2;
        System.out.println(allocateBooks(arr, k));
    }
}
