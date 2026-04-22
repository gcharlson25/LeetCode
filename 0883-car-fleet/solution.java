class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] cars = new int[position.length][2];
        for(int i = 0; i<position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);
        stack.push(((double)target-cars[cars.length-1][0]) / cars[cars.length-1][1]);
        for(int i = cars.length-2; i>=0; i--) {
            if(!stack.isEmpty() && ((double)target-cars[i][0]) / cars[i][1] > stack.peek()) {
                stack.push(((double)target-cars[i][0]) / cars[i][1]);
            }
        }
        return stack.size();
    }
}
