package StriversAtoZDSACourse.Strings;

public class ReverseTheString {
    public static String reverseTheSentence(String s){
        if(s.isEmpty() || s == null){
            return "";
        }
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);

        int start = 0;
        for(int end = 0 ; end < arr.length; end++){
            if(end == arr.length - 1 || arr[end] == ' '){
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return String.valueOf(arr);
    }

    private static void reverse(char[] charArray, int left, int right){
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseTheSentence("I am preparing for Google interview"));
    }
}
