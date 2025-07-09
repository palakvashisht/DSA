package StriversAtoZDSACourse.BinarySearch;

public class CountTheOccurrences {
    public static int indexOfLastOccurrence(int[] arr, int high, int low, int target){
        int lastIndex = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                lastIndex = mid;
                low = mid + 1;
            }else if(arr[mid] > target) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return lastIndex;
    }

    public static int indexOfFirstOccurrence(int[] arr, int high, int low, int target){
        int firstIndex = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                firstIndex = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return firstIndex;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,4};
        int high = arr.length-1;
        int low = 0;
        int target = 3;
        int occurrences = indexOfLastOccurrence(arr,high,low,target) - indexOfFirstOccurrence(arr, high,low, target) + 1;
        System.out.println("Occurrences of "+target+" are "+ occurrences);
    }
}
