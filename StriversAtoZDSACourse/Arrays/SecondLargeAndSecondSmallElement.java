package StriversAtoZDSACourse.Arrays;

public class SecondLargeAndSecondSmallElement {

    public static void main(String[] args) {
        int[] arr = {8,12,1,7,43, 2, 31, 4, 50};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest + "\nSecond smallest: " + secondSmallest + "\nLargest: " + largest + "\nSecondLargest: " + secondLargest);
    }
}
