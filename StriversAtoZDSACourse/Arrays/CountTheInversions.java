package StriversAtoZDSACourse.Arrays;

public class CountTheInversions {

    public static int countTheInversions(int[] arr){
        return mergeSort(arr, 0, arr.length-1);
    }

    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low < high){
            int mid = ( low + high )/2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr,mid+1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static int merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        int count = 0, i = 0;
        int[] temp = new int[high-low+1];
        while(left <= mid && right <= high){
            if(arr[left] > arr[right]){
                count = count + (mid - left + 1);
                temp[i] = arr[right];
                right++;
            }else{
                temp[i] = arr[left];
                left++;
            }
            i++;
        }
        while(left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }
        if (high + 1 - low >= 0) System.arraycopy(temp, 0, arr, low, high + 1 - low);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        System.out.println(countTheInversions(arr));
    }
}
