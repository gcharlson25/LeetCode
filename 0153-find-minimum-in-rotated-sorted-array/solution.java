class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int middle = (left + right) / 2;
            if(nums[middle] < nums[right]) {
                right = middle; 
            }
            else if(nums[middle] > nums[right]) {
                left = middle + 1;
            }
            if(left == right) {
                break;
            }
        }
        return nums[left];
    }
}
