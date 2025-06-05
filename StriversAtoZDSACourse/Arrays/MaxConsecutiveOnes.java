package StriversAtoZDSACourse.Arrays;

public class MaxConsecutiveOnes {

    public int countMaxConsecutiveOnes(int[] arr){
        int max = 0, count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        System.out.println(m.countMaxConsecutiveOnes(new int[]{1,1,0,0,1,0,1,1,1,0,1,1,1,1,0}));
    }
}
