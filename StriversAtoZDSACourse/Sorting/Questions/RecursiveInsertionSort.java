package StriversAtoZDSACourse.Sorting.Questions;

public class RecursiveInsertionSort {
    public void insertionSort(int[] arr, int n, int i) {
        if(n == i){
            return;
        }
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr, n, i+1);
    }

}
