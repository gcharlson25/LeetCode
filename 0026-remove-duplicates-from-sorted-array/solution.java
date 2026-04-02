class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int cur = 1; cur<nums.length; cur++) {
            if(nums[k] != nums[cur]) {
                k++;
                nums[k] = nums[cur];
            }
        }
        return k+1;
        

    }
}
