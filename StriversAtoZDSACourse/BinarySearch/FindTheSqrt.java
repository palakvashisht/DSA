package StriversAtoZDSACourse.BinarySearch;

public class FindTheSqrt {
    public static int findTheSqrt(int number){
        int low = 1;
        int high = number;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid*mid == number){
                return mid;
            }
            if(mid*mid <= number){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int number = 36;
        System.out.println("The square root of "+number+" is : "+findTheSqrt(number));
    }
}
