package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<Integer[]> fourSum(int[] arr, int target) {
        List<Integer[]> quads = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n ; i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            for(int j = i+1; j < n ; j++){
                if(j > i+1 && arr[j] == arr[j-1])
                    continue;
                int k = j+1;
                int l = n-1;
                while(k < l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        Integer[] temp = {arr[i], arr[j], arr[k], arr[l]};
                        quads.add(temp);
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]){
                            k++;
                        }
                        while(k < l && arr[l] == arr[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return quads;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0,-1,0,-2,2};
        int target1 = 0;
        List<Integer[]> quads1 = fourSum(arr1, target1);
        for (Integer[] quad : quads1){
            System.out.println(Arrays.toString(quad));
        }

        int[] arr2 = {4,3,3,4,4,2,1,2,1,1};
        int target2 = 9;
        List<Integer[]> quads2 = fourSum(arr2, target2);
        for (Integer[] quad : quads2){
            System.out.println(Arrays.toString(quad));
        }
    }
}
