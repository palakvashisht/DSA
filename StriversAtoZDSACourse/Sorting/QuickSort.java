package StriversAtoZDSACourse.Sorting;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[low];
            int partition = partitionIndex(arr, pivot, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public int partitionIndex(int[] arr,int pivot, int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {
            while(arr[i] <= pivot && i <= high-1) {
                i++;
            }
            while(arr[j] > pivot && j >= low){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {4, 9, 15, 16, 12, 6, 8, 13};
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
