package StriversAtoZDSACourse.Strings;

public class RotationOfString {
    public static boolean isTheStringRotationOfString(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        s1 = s1+s2;
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isTheStringRotationOfString("abcde", "bcdae"));
    }
}
