class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        int k = nums.length-1;
        int j = 1;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++) {
            k = nums.length-1;
            j = i+1;
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }            
            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    list.add(triplet);
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
        return list;
    }
}
