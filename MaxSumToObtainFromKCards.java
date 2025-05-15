public class MaxSumToObtainFromKCards {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k=4;

        int maxSum = 0;
        int sum = 0;
        int j = arr.length-1;

        for(int i = 0; i<=k-1; i++){
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        for(int i = k-1 ; i >=0 ; i--){
            sum = sum + arr[j] - arr[i];
            j--;
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("max sum is "+maxSum);
    }
}