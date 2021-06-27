class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int currentNumber = nums[i];
            Integer rest = map.get(target - currentNumber);
            if(rest != null && rest != i) {
                return new int[]{i, rest};
            }
            map.put(currentNumber, i);
        }
        return null; 
    }
    

}