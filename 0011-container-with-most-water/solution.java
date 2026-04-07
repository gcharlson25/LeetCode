class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start < height.length && end >= 0) {
            int area = 0;
            if(height[start] <= height[end]) {
                area = height[start] * (end-start);
                start++;
            }
            else if(height[start] > height[end]) {
                area = height[end] * (end-start);
                end--;
            }
            if(area > max) {
                max = area;
            }
        }
        return max;
    }
}
