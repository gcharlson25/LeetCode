class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 1; i < piles.length; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }
        int left = 1;
        int right = max;
        int middle = 0;
        while(left <= right) {
            middle = (left + right) / 2; 
            long hours = 0;
            for(int i = 0; i < piles.length; i++) {
                hours += (long)((Math.ceil((double)piles[i] / middle))); 
            }
            if(hours <= h) {
                right = middle - 1;
            }
            else if(hours > h) {
                left = middle + 1;
            }
        }
        return left;
    }
}
