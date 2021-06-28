class Solution {
    
    public int[] dp;
    
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 2;

        return dp(n - 1);
    }
    
    public int dp(int n) {
        if (dp[n] != -1 || n == 1) {
            return dp[n];
        }

        dp[n] = dp(n-1) + dp(n-2);
        return dp[n];
    }
}