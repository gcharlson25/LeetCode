class KthLargest {

    private PriorityQueue<Integer> scores;
    private int kth;

    public KthLargest(int k, int[] nums) {
        kth = k;
        scores = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++) {
            scores.add(nums[i]);
            if(scores.size() > kth) {
                scores.remove();
            }
        }
    }
    
    public int add(int val) {
        scores.add(val);
        if(scores.size() > kth) {
            scores.remove();
        }
        return scores.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
