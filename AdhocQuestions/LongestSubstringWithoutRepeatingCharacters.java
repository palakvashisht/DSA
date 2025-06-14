package AdhocQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        char[] substring = {'a', 'b', 'c', 'b', 'd', 'e', 'f', 'g', 'h'};
        int startIndex = 0, endIndex = 0, maxLength = 0;

        Map<Character, Integer> longestSubstring = new HashMap<>();

        for(endIndex = 0; endIndex < substring.length; endIndex++) {
            if(longestSubstring.containsKey(substring[endIndex])) {
                startIndex = Math.max(startIndex, longestSubstring.get(substring[endIndex]) + 1);
            }else {
                longestSubstring.put(substring[endIndex], endIndex);
                maxLength = Math.max(maxLength, endIndex - startIndex + 1);
            }
        }
        System.out.println(maxLength);
    }
}
