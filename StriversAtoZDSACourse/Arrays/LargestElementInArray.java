package StriversAtoZDSACourse.Arrays;

public class LargestElementInArray {

    public int bruteForce(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, arr[i]);
                }else {
                    max = Math.max(max, arr[j]);
                }
            }
        }
        return max;
    }

    public int recursive(int[] arr, int i) {
        int max = arr[0];
        while(i < arr.length-1) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                } else {
                    max = Math.max(max, arr[j]);
                }
            }
            i++;
            recursive(arr, i);
        }
        return max;
    }

    public static void main(String[] args) {
        LargestElementInArray obj = new LargestElementInArray();
        System.out.println(obj.bruteForce(new int[]{8,12,1,7, 2, 31, 4, 500}));
        System.out.println(obj.recursive(new int[]{8,12,1,7, 2, 31, 4, 500}, 0));
    }
}
