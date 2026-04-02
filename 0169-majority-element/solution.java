class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }    
            else {
                map.put(nums[i], 1);
            }
        }
        for(int a = 0; a<nums.length; a++) {
            if(map.get(nums[a]) > Math.floor(nums.length/2)) {
                return nums[a];
            }
        }
        return 0;
    }
}
