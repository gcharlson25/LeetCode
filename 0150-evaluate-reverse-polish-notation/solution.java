class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i<tokens.length; i++) {
            if(tokens[i].equals("+")) {
                stack.push(Integer.toString(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
            }
            else if(tokens[i].equals("-")) {
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num1 - num2));
            }
            else if(tokens[i].equals("*")) {
                stack.push(Integer.toString(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
            }
            else if(tokens[i].equals("/")) {
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num1 / num2));
            }    
            else {
                stack.push(tokens[i]);
            }                                
        }
        return Integer.parseInt(stack.peek());
    }
}
