class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(j<k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]) {
                        k--;
                    }    
                }
                else if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }            
            }
        }
        return result;

    }
}
