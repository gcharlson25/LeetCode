class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] array = new int[k];
        int count = 0;
        for(int num: nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }
            else if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
        }
        int maxKey = 0;
        for (int i = 0; i<k; i++) {
            int max = Integer.MIN_VALUE;
            for(int key: map.keySet()) {
                if(map.get(key) >= max) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            array[count] = maxKey;
            count++;
            map.remove(maxKey);
        }
        

        return array;
    }
}
