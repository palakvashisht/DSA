package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTheOverlappingArrays {
    public static List<List<Integer>> mergeOverlappingArrays(int[][] arr){
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> ans = mergeOverlappingArrays(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
