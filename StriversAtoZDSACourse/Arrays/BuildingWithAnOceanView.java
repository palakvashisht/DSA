package StriversAtoZDSACourse.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildingWithAnOceanView {
    public static int[] findBuildings(int[] heights) {
            int n = heights.length;
            List<Integer> indices = new ArrayList<>();
            int maxHeight = heights[n-1];
            indices.add(n-1);
            for(int i = n-2 ; i >= 0 ; i--){
                if(heights[i] > maxHeight){
                    indices.add(i);
                    maxHeight = heights[i];
                }
            }
            int[] ans = indices.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(ans);
            return ans;
    }

    public static void main(String[] args) {
        int[] heights = {4,2,3,1};
        System.out.println(Arrays.toString(findBuildings(heights)));
    }
}
