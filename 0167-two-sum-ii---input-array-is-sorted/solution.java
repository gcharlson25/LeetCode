class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int front = 0;
        int back = numbers.length-1;
        while(front < numbers.length && back >= 0) {
            if(numbers[front] + numbers[back] == target) {
                result[0] = front+1;
                result[1] = back+1;
                break;
            }
            else if(numbers[front] + numbers[back] <= target) {
                front++;
            }
            else if(numbers[front] + numbers[back] >= target) {
                back--;
            }
        }
        return result;

    }
}
