package AdhocQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,2,5,1,9};
        Map<Integer, Integer> map = new HashMap<>();
        int[] duplicates = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            map.compute(arr[i],(k,v)-> v+1);
            /*if(duplicates[arr[i]] == null && map.get(arr[i])>1){
                duplicates[arr[i]];
            }*/
        }
    }
}
