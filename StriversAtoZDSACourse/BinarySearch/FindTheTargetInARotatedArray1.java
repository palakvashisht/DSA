package StriversAtoZDSACourse.BinarySearch;

public class FindTheTargetInARotatedArray1 {
    public static int findTheTarget(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] >= arr[low]){ //left sorted
                if(target <= arr[mid] && target >= arr[low]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{ // right sorted
                if(target >= arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int target = 5;
        int low = 0;
        int high = arr.length - 1;
        System.out.println("The index of target is : "+findTheTarget(arr, low, high, target));
    }
}
