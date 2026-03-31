
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            else if(bracket == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(bracket == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(bracket == '}') {
                if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
