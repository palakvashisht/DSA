package StriversAtoZDSACourse.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void mergeSortedArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int left = n-1;
        int right = 0;

        while(left >= 0 || right < m){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        mergeSortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
