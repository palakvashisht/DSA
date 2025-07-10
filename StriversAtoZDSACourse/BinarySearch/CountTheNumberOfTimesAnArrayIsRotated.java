package StriversAtoZDSACourse.BinarySearch;

public class CountTheNumberOfTimesAnArrayIsRotated {
    public static int countOfRotationOfSortedArray(int[] arr, int low, int high){
        int minimum = Integer.MAX_VALUE;
        int ans = -1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[high]){
                if(arr[low] < minimum){
                    ans = low;
                }
                break;
            }else if(arr[mid] >= arr[low]){ // left sorted
                if(arr[low] < minimum){
                    ans = low;
                    minimum = arr[low];
                }
                low = mid + 1;
            }else{
                if(arr[mid] < minimum){
                    ans = mid;
                    minimum = arr[mid];
                }
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("The number of times a sorted array is rotated : "+countOfRotationOfSortedArray(arr, low, high));
    }
}
