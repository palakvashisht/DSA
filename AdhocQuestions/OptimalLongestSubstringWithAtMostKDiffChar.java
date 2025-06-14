package AdhocQuestions;

import java.util.HashMap;
import java.util.Map;

public class OptimalLongestSubstringWithAtMostKDiffChar {
    public static void main(String[] args) {
        char[] arr = {'a','a','a','b','b','c','c','c','b','b','d'};
        int r = 0, l = 0, k = 2, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        while( r < arr.length ){
            map.merge(arr[r], 1, Integer::sum);
            if(map.size()>k){
               map.compute(arr[l], (i,v)-> v > 1 ? v-1 : null) ;
               l++;
            }else{
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }
        System.out.println("Maxlength of the substring is : "+maxLength);
    }
}
