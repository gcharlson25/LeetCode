class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] array = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++) {
            int amount = 0;
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                amount = stack.pop();
                array[amount] = i - amount;
            }
            stack.push(i);
        }
        return array;
    }
}
