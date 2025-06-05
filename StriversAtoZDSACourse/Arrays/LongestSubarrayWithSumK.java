package StriversAtoZDSACourse.Arrays;

public class LongestSubarrayWithSumK {

    public int longestSubarray(int[] a, int k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubarrayWithSumK ls = new LongestSubarrayWithSumK();
        System.out.println(ls.longestSubarray(new int[]{1, 2, 1, 1, 1}, 3));
    }
}
