/*Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
The number returned should not have leading zero's. But the given input string may have leading zero.*/
public class largestOddNumber {
     public static String largerOddNumber(String s){
          int ind = -1;
          for(int i = s.length()-1;i>=0;i--){
               if((s.charAt(i)-'0')%2==1){
                    ind=i;
                    break;
               }
          }
          if(ind==-1){
               return "";
          }
          int i=0;
          while(i<=ind && s.charAt(i)=='0'){
               i++;
          }
          return s.substring(i,ind+1);
     }
     public static void main(String[] args) {
          String s = "0214638";
          System.out.println(largerOddNumber(s));
     }
}