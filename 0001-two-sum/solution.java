class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] array = new int[2];
        for(int i = 0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                array[0] = map.get(nums[i]);
                array[1] = i;
            }            
            map.put(target-nums[i], i);

        }
        return array;
    }
}
