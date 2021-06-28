class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int localMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (localMax < 0) {
                localMax = nums[i];
            } else {
                localMax += nums[i];
            }
            max = Math.max(max, localMax);
        }

        return max;
    }
}