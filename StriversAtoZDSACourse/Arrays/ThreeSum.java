package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<Integer[]> threeSum(int[] arr){
        List<Integer[]> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            if(i>0 && arr[i] == arr[i-1])
                continue;
            int j = i+1, k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    Integer[] temp = {arr[i], arr[j], arr[k]};
                    list.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while (j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-2,-2,-2,-1,-1,0,0,1,1,1,2,2};

        for ( Integer[] elements : threeSum(arr)){
            System.out.println(Arrays.toString(elements));
        }
    }

}
