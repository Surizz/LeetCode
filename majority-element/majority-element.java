class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;
        for(int i=0; i<nums.length; ++i) {
            if(count == 0) {
                major = nums[i];
            }
            
            count += major == nums[i] ? 1 : -1;
        }
        
        return major;
    }
}