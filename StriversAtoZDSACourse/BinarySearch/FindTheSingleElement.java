package StriversAtoZDSACourse.BinarySearch;

public class FindTheSingleElement {
    public static int findTheSingleElement(int[] arr, int high, int low){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-2] != arr[n-1]){
            return arr[n-1];
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if((mid%2 == 1 && arr[mid] == arr[mid-1]) || (mid%2 == 0 && arr[mid] == arr[mid+1])){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int low = 1;
        int high = arr.length - 2;
        System.out.println("The single element in a sorted array is : "+findTheSingleElement(arr, low, high));
    }
}
