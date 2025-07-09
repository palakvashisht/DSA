package StriversAtoZDSACourse.BinarySearch;

public class UpperBound {
    public static int upperBound(int[] arr, int high, int low, int x, int ans){
        if (low > high)
            return ans;
        int mid = low +(high - low)/2;
        if(arr[mid] > x){
            return upperBound(arr, mid-1, low, x, mid);
        }else{
            return upperBound(arr, high, mid+1, x, ans);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,8,8,10,10,11};
        int ans = arr.length;
        int x = 5;
        int high = arr.length-1;
        int low = 0;
        System.out.println(upperBound(arr,high,low,x,ans));
    }
}
