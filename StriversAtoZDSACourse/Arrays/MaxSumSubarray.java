package StriversAtoZDSACourse.Arrays;

public class MaxSumSubarray {

    public int maxSum(int[] arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
                start = i;
            }
            maxSum = Math.max(maxSum, sum);
            end++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSubarray obj = new MaxSumSubarray();
        System.out.println("Max sum is : "+obj.maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
