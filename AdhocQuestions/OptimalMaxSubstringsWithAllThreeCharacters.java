package AdhocQuestions;

import java.util.Arrays;

public class OptimalMaxSubstringsWithAllThreeCharacters {
    public static void main(String[] args) {
        String st = "bbabcaa";
        int count = 0;
        char[] arr = st.toCharArray();
        int[] ch = {-1,-1,-1};

        for(int i = 0; i < arr.length; i++){
            ch[arr[i] - 'a'] = i;
            if(ch[0] != -1 && ch[1] != -1 && ch[2] != -1){
                count = count + (1 + Arrays.stream(ch).min().getAsInt());
            }
        }
        System.out.println(count);
    }
}
