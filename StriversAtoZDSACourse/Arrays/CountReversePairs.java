package StriversAtoZDSACourse.Arrays;

public class CountReversePairs {
    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += countTheReversePairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    public static int countTheReversePairs(int[] arr, int low, int mid, int high){
        int count = 0;
        int right = mid+1;
        for (int i = low; i <= mid; i++) {
            while(right < high && arr[i] > 2 * arr[right]){
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1, i = 0;
        int[] temp = new int[high - low + 1];
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
            }else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }
        while (left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while (right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }
        if (high + 1 - low >= 0) System.arraycopy(temp, 0, arr, low, high + 1 - low);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }
}
