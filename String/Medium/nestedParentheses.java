//Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

public class nestedParentheses {
     public static int maxDepth(String s) {
        int count=0;
        int max = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
     String s = "(1+(2*3)+((8)/4))+1";
     System.out.println(maxDepth(s));
    }
}