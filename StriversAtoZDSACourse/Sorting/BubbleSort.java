package StriversAtoZDSACourse.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int temp : arr){
            System.out.print(temp + " ");
        }
    }
}
