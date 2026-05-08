// Implement the function myAtoi(s) which converts the given string s to a 32-bit signed integer (similar to the C/C++ atoi function).

public class StringToInteger {
     public static int myAtoi(String s) {
        if(s==null || s.length()==0){
            return 0;
        }

        int i =0;
        int n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n){
            return 0;
        }
        int sign =1;
        if(s.charAt(i)=='+'){
            i++;
        }
        else if(s.charAt(i)=='-'){
            sign =-1;
            i++;
        }
        long res = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            res = res*10 + digit;

            if(sign*res<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(sign*res>=Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int)(res*sign);
    }
    public static void main(String[] args) {
     String s = "08";
     System.out.println(myAtoi(s));
    }
}
