package AdhocQuestions;

public class SumLessThanOrEqualToK {

    public int BruteForce(int[] arr, int k) {
        int n = arr.length;

        int maxLength = 0;

        // Try every possible subarray
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum <= k) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                } else {
                    break; // No point in continuing further as sum exceeded k
                }
            }
        }
        return maxLength;
    }

    public int betterSolution(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLength = 0;

        while(j<arr.length){
            sum = sum + arr[j];
            while(sum > k){
                sum = sum - arr[i];
                i++;
            }
            if(sum <= k){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }else{
                break;
            }
        }
        return maxLength;
    }

    public int optimalSolution(int[] arr, int k){
        int l = 0, r = 0, sum = 0, maxLength = 0;

        while(r < arr.length){
            sum = sum + arr[r];
            if(sum > k){
                sum = sum - arr[l];
                l++;
            }else{
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }

        return maxLength;
    }


    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 5, 2, 7, 10, 6, 1, 1, 1, 1, 3, 2, 2, 4};
        int k = 17;
        SumLessThanOrEqualToK sumLessThanOrEqualToK = new SumLessThanOrEqualToK();

        System.out.println("Length of longest subarray with sum <= " + k + " by BruteForce is: " + sumLessThanOrEqualToK.BruteForce(arr, k));
        System.out.println("Length of longest subarray with sum <= " + k + " by BetterSolution is: " + sumLessThanOrEqualToK.betterSolution(arr, k));
        System.out.println("Length of longest subarray with sum <= " + k + " by OptimalSolution is: " + sumLessThanOrEqualToK.optimalSolution(arr, k));
    }
}
