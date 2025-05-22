import java.util.Scanner;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1};
        int sum = 0, r = 0, l = 0, count = 0, k = 2;

        while(r < arr.length) {
            sum = sum + arr[r];
            if(sum == k){
                count++;
            }else if(sum > k){
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println(count);
    }
}
