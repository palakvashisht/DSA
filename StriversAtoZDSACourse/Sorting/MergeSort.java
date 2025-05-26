package StriversAtoZDSACourse.Sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            return merge(arr, low, mid, high);
        }
        return null;
    }

    public int[] merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1, i = 0;
        int[] temp = new int[high - low + 1];
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
            }else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }
        while (left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while (right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }
        if (high + 1 - low >= 0) System.arraycopy(temp, 0, arr, low, high + 1 - low);
      return arr;
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = new int[]{1,6,13,2,4,1,9,12,45,5};
        arr = ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
