package StriversAtoZDSACourse.Sorting;

public class Revision {

    public int[] doSelectionSort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++ ){
            int min = i;
            for(int j = i ; j < arr.length-2 ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public int[] doBubbleSort(int[] arr){
        for(int i = arr.length-1 ; i >= 0 ; i--){
            for(int j = 0 ; j < i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
