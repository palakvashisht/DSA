package StriversAtoZDSACourse.Arrays;

import java.util.Arrays;

public class Sort012OnlyArray {
    public void sortArray(int[] arr) {
        int low=0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,0,1,0,2,0};
        Sort012OnlyArray obj = new Sort012OnlyArray();
        obj.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
