/* A valid parentheses string is defined by the following rules:

->It is the empty string "".
->If A is a valid parentheses string, then so is "(" + A + ")".
->If A and B are valid parentheses strings, then A + B is also valid.

A primitive valid parentheses string is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.

Given a valid parentheses string s, your task is to remove the outermost parentheses from every primitive component of s and return the resulting string. */

import java.util.Stack;

public class parentheses{
     public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c :s.toCharArray()){
            if(c=='('){
                if(!stack.isEmpty()){
                    result.append(c);
                }
                stack.push(c);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()) result.append(c);
            }
        }
        return result.toString();
    }
     public static void main(String[] args) {
          String s = "(()())(())";
          System.out.print(removeOuterParentheses(s));

     }
}