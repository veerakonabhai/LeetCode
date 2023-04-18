class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty())
                    return false;
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
}