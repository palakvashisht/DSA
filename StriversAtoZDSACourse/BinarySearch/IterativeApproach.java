package StriversAtoZDSACourse.BinarySearch;

public class IterativeApproach {

    public static int iterativeApproach(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                high = mid;
            }else{
                low = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8};
        System.out.println(iterativeApproach(arr, arr.length, 3));
    }
}
