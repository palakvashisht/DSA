import java.util.Arrays;
import java.util.HashMap;

public class Revise {

    public int longestSubarrayWithSumLessThanOrEqualToK(int[] arr, int k) {
        int l = 0, r = 0, size = 0, sum = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            if(sum > k){
                sum = sum - arr[l];
                l++;
            }
            if(sum <= k){
                size = Math.max(size, r - l + 1);
            }
            r++;
        }
        return size;
    }

    public int maxPointsToObtainFromKCards(int k, int[] arr) {
        int r = arr.length-1, maxSum = 0, sum = 0;
        for(int l = 0; l < k; l++) {
            sum = sum + arr[l];
            maxSum = Math.max(maxSum, sum);
        }
        for(int l = k-1; l >= 0; l--) {
            sum = sum - arr[l] + arr[r];
            maxSum = Math.max(maxSum, sum);
            r--;
        }
        return maxSum;
    }

    public int longestSubstringWithNoRepeatingCharacters(String s) {
        char[] ch = s.toCharArray();
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxLen = 0;
        while (r < ch.length) {
            if(hash[ch[r]] != -1){
                if(hash[ch[r]] >= l)
                    l = hash[ch[r]] + 1;
            }else{
                hash[ch[r]] = r ;
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }

    public int maxConsecutiveOnes(int[] arr, int k) {
        int l = 0, r = 0, zeroes = 0, maxLen = 0;
        while (r < arr.length) {
            if(arr[r] == 0){
                zeroes++;
            }
            if(zeroes <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }else {
                if(arr[l] == 0){
                    zeroes--;
                }
                l++;
            }
            r++;
        }
         return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,7,1, 4, 3, 2, 11};
        int[] consecutiveOnesAndZeroes = {1,1,1,1,0,0,0,1,0,1,1,1,1,0};
        Revise revise = new Revise();
        System.out.println(revise.longestSubarrayWithSumLessThanOrEqualToK(arr, 14));
        System.out.println(revise.maxPointsToObtainFromKCards(4, arr));
        System.out.println(revise.longestSubstringWithNoRepeatingCharacters("abcdbcefgh"));
        System.out.println(revise.maxConsecutiveOnes(consecutiveOnesAndZeroes, 2));
    }
}
