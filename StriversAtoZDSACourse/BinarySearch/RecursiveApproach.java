package StriversAtoZDSACourse.BinarySearch;

public class RecursiveApproach {
    public static int recursiveApproach(int[] arr, int low, int high, int target){
        if(low>high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid;
        }else if(target > arr[mid]){
            return recursiveApproach(arr, mid+1, high, target);
        }else{
            return recursiveApproach(arr, low, mid-1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(recursiveApproach(arr, 0, arr.length-1, 6));
    }
}
