package StriversAtoZDSACourse.Arrays;

public class MaximumProductOfSubarray {
    public static int maximumProduct(int[] arr){
        int prefixProduct = 1;
        int suffixProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            prefixProduct = prefixProduct * arr[i];
            suffixProduct = suffixProduct * arr[n - i - 1];

            if(prefixProduct == 0){
                prefixProduct = 1;
            }
            if(suffixProduct == 0){
                suffixProduct = 1;
            }
            maxProduct = Math.max(prefixProduct, suffixProduct);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        System.out.println(maximumProduct(arr));
    }
}
