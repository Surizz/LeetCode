class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];

        for (int i = 0; i < prices.length; ++i) {
            if (start > prices[i]) {
                start = prices[i];
            }

            max = Math.max(max, prices[i] - start);
        }

        return max;
    }
}