class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start<end) {
            if((Math.min(height[start], height[end])) * (end-start) > max) {
                max = (Math.min(height[start], height[end])) * (end-start);
            }
            if(height[start] >= height[end]) {
                end--;
            }
            else if(height[start] < height[end]) {
                start++;
            }            
        }
        return max;
    }
}
