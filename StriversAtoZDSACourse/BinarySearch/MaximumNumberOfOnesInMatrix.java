package StriversAtoZDSACourse.BinarySearch;

public class MaximumNumberOfOnesInMatrix {
    public static int maxOnesInAMatrix(int[][] matrix){
        int n = matrix.length;
        int maxCount = 0;
        int index = -1;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            int count = 0;
            count =  m - LowerBound.lowerBound(matrix[i], n-1, 0, 1, count);
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 1, 1},
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        System.out.println(maxOnesInAMatrix(arr));
    }
}
