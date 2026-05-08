/*You are given a string s. Return the array of unique characters, sorted by highest to lowest occurring characters.
If two or more characters have same frequency then arrange them in alphabetic order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class frequencyOfCharacter {
     public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char ch: list){
            int freq = map.get(ch);
            while(freq-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
     public static void main(String[] args) {
          String s = "tree";
          System.out.println(frequencySort(s));
     }
}