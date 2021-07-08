class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int left = 0, right = height.length - 1;
            left < right;) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }

        return maxArea;
    }
}