//Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space. Return a string with the words in reverse order, concatenated by a single space.

public class palindrome {
     public static String reverseWords(String s){
          String[] word = s.trim().split("\\s+");
          StringBuilder reverse = new StringBuilder();
          for(int i = word.length-1;i>=0;i--){
               reverse.append(word[i]);
               if(i>0){
                    reverse.append(" ");
               }
          }
          return reverse.toString();
     }
     public static void main(String[] args) {
          String s = "the sky is blue";
          System.out.print(reverseWords(s));
     }
}
