package StriversAtoZDSACourse.Arrays;

import java.util.Arrays;

public class RightShiftByKElements {
    public void reverse(int[] arr, int start, int end) {
        while(end>start){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public void shiftRight(int[] arr, int k){
        int n = arr.length;
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        RightShiftByKElements obj = new RightShiftByKElements();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        obj.shiftRight(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
