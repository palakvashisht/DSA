package StriversAtoZDSACourse.BinarySearch;

public class KthMissingElement {
    public static int findTheKthMissingElement(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;;

        while(low <= high){
            int mid = low + (high-low)/2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;
        System.out.println(findTheKthMissingElement(arr, k));
    }
}
