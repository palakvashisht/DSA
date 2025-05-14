public class LongestSubarrayWithAtMostKZeroes {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k = 2;
        int zeroes = 0;
        int maxLength = 0;
        int l = 0, r = 0, length = arr.length;

        while(r < length){
            if(arr[r] == 0){
                zeroes++;
            }
            if(zeroes > k){
                if(arr[l] == 0){
                    zeroes --;
                }
                l++;
            }if(zeroes <= k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }
        System.out.println(maxLength);
    }
}
