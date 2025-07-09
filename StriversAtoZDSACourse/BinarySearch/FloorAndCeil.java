package StriversAtoZDSACourse.BinarySearch;

public class FloorAndCeil {

    public static int findFloor(int[] arr, int low, int high, int x, int ans){
        if (low > high)
            return ans;
        int mid = low + (high - low) / 2;
        if (arr[mid] <= x) {
            return findFloor(arr, mid + 1, high, x, mid); // go right
        } else {
            return findFloor(arr, low, mid - 1, x, ans);  // go left
        }
    }

    public static int findCeil(int[] arr, int low, int high, int x, int ans){
        if (low > high)
            return ans;
        int mid = low + (high - low) / 2;
        if (arr[mid] >= x) {
            return findCeil(arr, low, mid - 1, x, mid); // go left
        } else {
            return findCeil(arr, mid + 1, high, x, ans); // go right
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int low = 0;
        int high = arr.length - 1;
        int x = 5;
        int floor = findFloor(arr, low, high, x, -1);
        int ceil = findCeil(arr, low, high, x, -1);
        System.out.println("Floor is: " + (floor != -1 ? arr[floor] : "None"));
        System.out.println("Ceil is: " + (ceil != -1 ? arr[ceil] : "None"));
    }
}
