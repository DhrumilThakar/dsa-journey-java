/*Roman numerals are represented by seven different symbols: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
For example: 2 is written as II, 12 is written as XII, 27 is written as XXVII.
Roman numerals are usually written largest to smallest from left to right. But in six special cases, subtraction is used instead of addition:
I before V or X → 4 and 9,
X before L or C → 40 and 90,
C before D or M → 400 and 900
Given a Roman numeral, convert it to an integer. */

public class romanToInteger {
     public static int getvalue(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    public static int romanToInt(String s) 
    {
        int total=0;
        int previous =0;
        for(int i =s.length()-1;i>=0;i--)
        {
            int current=getvalue(s.charAt(i));
            if(previous>current)
            {
                total-=current;
            }
            else
            {
                total+=current;
            }
            previous = current;
        }
        return total;
    }
     public static void main(String[] args) {
          String  s = "MCMXCIV";
          System.out.println(romanToInt(s));
     }
}