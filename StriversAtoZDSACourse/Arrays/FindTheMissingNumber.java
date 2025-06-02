package StriversAtoZDSACourse.Arrays;

public class FindTheMissingNumber {
    public int findTheMissing(int[] arr, int n) {
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != j) {
                break;
            }
            j++;
        }
        return j;
    }

    public static void main(String[] args) {
        FindTheMissingNumber obj = new FindTheMissingNumber();
        int[] arr = {1,2,3,4};
        int missingNumber = obj.findTheMissing(arr, 5);
        System.out.println("The missing number is :"+missingNumber);
    }
}
