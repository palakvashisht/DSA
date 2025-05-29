package StriversAtoZDSACourse.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();
        int[] arr = {1,1,2,2,3,3,4};
        int index = r.removeDuplicates(arr);
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}
