package StriversAtoZDSACourse.Arrays;

public class CheckIfSumOfPairIsEqualToTarget {

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int i = 0, j = arr.length - 1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.println("true for indices "+i + " " + j);
                break;
            }else if(sum > target){
                j--;
            }else {
                i++;
            }
        }
    }
}
