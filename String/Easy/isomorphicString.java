/* Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.*/

import java.util.*;

public class isomorphicString {
      public static boolean isomorphicString(String s, String t){
          if(s.length()!=t.length()){
               return false;
          }
          Map<Character, Character> mS = new HashMap<>();
          Map<Character,Character> mT = new HashMap<>();
          for(int i =0;i<s.length();i++){
               char cS = s.charAt(i);
               char cT = t.charAt(i);
               if(mS.containsKey(cS)){
                    if(mS.get(cS)!=cT){
                         return false;
                    }
               }
               if(mT.containsKey(cT)){
                    if(mT.get(cT)!=cS){
                         return false;
                    }
               }
               else{
                    mT.put(cT,cS);
                }

          }
          return true;
      }
     public static void main(String[] args) {
          String s = "paper", t = "title";
          System.out.println(isomorphicString(s,t));
     }
}
