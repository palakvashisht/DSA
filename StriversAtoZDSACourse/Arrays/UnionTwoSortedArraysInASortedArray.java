package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionTwoSortedArraysInASortedArray {

    public List<Integer> unionTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            }else if(arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }
        return list;
    }
    public static void main(String[] args) {
        UnionTwoSortedArraysInASortedArray unionTwoSortedArraysInASortedArray = new UnionTwoSortedArraysInASortedArray();
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};
        List<Integer> result = unionTwoSortedArraysInASortedArray.unionTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
