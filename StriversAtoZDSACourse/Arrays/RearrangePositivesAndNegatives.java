package StriversAtoZDSACourse.Arrays;

import java.util.Arrays;

public class  RearrangePositivesAndNegatives {

    public int[] rearrangePositivesAndNegatives(int[] arr) {
        int[] finalArr = new int[arr.length];
        int positives = 0, negatives = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                finalArr[negatives] = arr[i];
                negatives+=2;
            }else {
                finalArr[positives] = arr[i];
                positives+=2;
            }
        }
        return finalArr;
    }

    public static void main(String[] args) {
        RearrangePositivesAndNegatives rearrangePositivesAndNegatives = new RearrangePositivesAndNegatives();
        int[] arr = {1,2,-3,-2,-1,3};
        System.out.println(Arrays.toString(rearrangePositivesAndNegatives.rearrangePositivesAndNegatives(arr)));
    }
}
