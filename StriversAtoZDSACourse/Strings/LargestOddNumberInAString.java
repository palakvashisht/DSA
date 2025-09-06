package StriversAtoZDSACourse.Strings;

public class LargestOddNumberInAString {
    public static String largestOddNumber(String s){
        char[] charArray = s.toCharArray();
        int endIndex = -1;
        for(int i = charArray.length - 1; i >= 0; i--){
            if(charArray[i] % 2 == 1){
                endIndex = i;
                break;
            }
        }
        return s.substring(0, endIndex+1);
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("254365690248"));
    }
}
