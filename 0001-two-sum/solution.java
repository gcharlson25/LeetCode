class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            for(int a = 0; a <nums.length; a++) {
                if(i != a && nums[a] == val) {
                    answer[0] = i;
                    answer[1] = a;
                    return answer;
                }
            }
        }
        return answer;
    }
}
