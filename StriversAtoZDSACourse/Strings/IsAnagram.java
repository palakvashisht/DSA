package StriversAtoZDSACourse.Strings;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[256];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for(int ch : count){
            if(ch != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }
}
