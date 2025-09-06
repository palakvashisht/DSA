package StriversAtoZDSACourse.Strings;

public class RemoveOuterMostParentheses {
    public static String removeParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : S.toCharArray()) {
            if(c == '('){
                if(depth > 0){
                    sb.append('(');
                }
                depth++;
            }else{
                depth--;
                if(depth > 0){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeParentheses("()(()())(())"));
    }
}
