package StriversAtoZDSACourse.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map1.containsKey(c1)){
                if(!map1.get(c1).equals(c2)){
                    return false;
                }
            }else {
                map1.put(c1, c2);
            }

            if(map2.containsKey(c2)){
                if(!map2.get(c2).equals(c1)){
                    return false;
                }
            }else {
                map2.put(c2, c1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abcde", "bcdae"));
    }
}
