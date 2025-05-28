package StriversAtoZDSACourse.Arrays;

import java.util.Arrays;

public class ArrayIsSortedOrNot {
    public boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(!(arr[i] < arr[i+1])){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int[] unSortedArray = {8,12,1,7,43, 2, 31, 4, 50};
        int[] sortedArray = {1,2,3,4,5};
        ArrayIsSortedOrNot arrayIsSortedOrNot = new ArrayIsSortedOrNot();
        System.out.println("Unsorted Array passed, returns isArraySorted : "+arrayIsSortedOrNot.isSorted(unSortedArray));
        System.out.println("Sorted Array passed, returns isArraySorted : "+arrayIsSortedOrNot.isSorted(sortedArray));
    }
}
