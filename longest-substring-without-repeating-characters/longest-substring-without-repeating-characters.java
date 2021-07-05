class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        Map<Character, Integer> idxMap = new HashMap<>();
        for(int left = 0, right = 0; right < s.length(); ++right) {
            if(idxMap.containsKey(s.charAt(right))) {
                left = Math.max(left, idxMap.get(s.charAt(right)));
            }

            ans = Math.max(ans, right - left + 1);
            idxMap.put(s.charAt(right), right + 1);
        }

        return ans;
    }
}