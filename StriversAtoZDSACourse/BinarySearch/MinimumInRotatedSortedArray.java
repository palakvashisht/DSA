package StriversAtoZDSACourse.BinarySearch;

public class MinimumInRotatedSortedArray {
    public static int minimumSortedArray(int[] arr, int low, int high){
        int minimum = Integer.MAX_VALUE;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[high]){
                minimum = Math.min(minimum, arr[low]);
                break;
            }else if(arr[mid] > arr[low]){ // left sorted
                minimum = Math.min(minimum, arr[low]);
                low = mid + 1;
            }else{
                minimum = Math.min(minimum, arr[mid]);
                high = mid - 1;
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("The minimum of sorted array is : "+minimumSortedArray(arr, low, high));
    }
}
