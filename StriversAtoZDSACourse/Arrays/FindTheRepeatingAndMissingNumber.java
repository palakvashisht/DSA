package StriversAtoZDSACourse.Arrays;

public class FindTheRepeatingAndMissingNumber {
    public static void findTheNumbers(int[] arr){
       int n = arr.length;
       long Sn = ((long) n *(n+1))/2;
       long Sn2 = (n * (n + 1) * (2L * n + 1)) / 6;

       long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long) arr[i] + arr[i];
        }
        long val1 = S - Sn ;
        long val2 = Sn2 - S2;
        val2 = val2/val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        System.out.println("Missing number is :"+ x +"Repeating number is : "+y);

    }

}
