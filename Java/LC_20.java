package Java;

import java.util.Stack;

/* 
 * Leet code problem 20 - Valid parenthesis
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']'
 * determine if the input string is valid. An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * return boolean
 * 
 * Input: s = "{[]}"
 * Output: true
 * Input: s = "(]"
 * Output: false
 */

public class LC_20 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                // insert all the open brackets into stack
                stack.push(bracket);
            } else {
                // if stack is empty return false as we are seeing an closed bracket but there is no open bracket in stack
                if (stack.isEmpty())
                    return false;
                // see for each closed bracket if it's counter open bracket is not there then return false
                char returnedBracket = stack.pop();
                if (returnedBracket == '(' && s.charAt(i) != ')')
                    return false;
                if (returnedBracket == '{' && s.charAt(i) != '}')
                    return false;
                if (returnedBracket == '[' && s.charAt(i) != ']')
                    return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}()", s2 = "{(}[]", s3 = "{[(", s4 = ")]}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

}