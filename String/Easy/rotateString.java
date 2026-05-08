/* Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position. For example, if s = "abcde", then it will be "bcdea" after one shift.
     */
public class rotateString {
     public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
     public static void main(String[] args) {
          String  s = "rotation", goal = "tionrota";
          System.out.println(rotateString(s,goal));
     }
}
