/*The beauty of a string is defined as the difference between the frequency of the most frequent character and the least frequent character (excluding characters that do not appear) in that string.

Given a string s, return the sum of beauty values of all possible substrings of s. */
public class beautyOfSubString {
     public static int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for(int i =0;i<n;i++){
            int[] freq = new int[26];
            for(int j =i;j<n;j++){
                freq[s.charAt(j)-'a']++;
            
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int k =0;k<26;k++){
                if(freq[k]>0){
                    max = Math.max(max,freq[k]);
                    min = Math.min(min,freq[k]);
                }
            }
            ans+=(max-min);
        }
        }
        return ans;
    }
    public static void main(String[] args) {
     String s = "aabcb";
     System.out.println(beautySum(s));
    }
}