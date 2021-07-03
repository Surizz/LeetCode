class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];

        for (int i = 2; i <= n; i *= 2) {
            bits[i] = 1;
            for (int j = i + 2; (j < i * 2) && (j <= n); j += 2) {
                bits[j] = bits[i] + bits[j - i];
            }
        }

        for (int i = 1; i <= n; i += 2) {
            bits[i] = 1 + bits[i - 1];
        }

        return bits;
    }
}