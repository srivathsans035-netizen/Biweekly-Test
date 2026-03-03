class stock {
    public int maxProfit(int[] prices) {
        int curr = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (curr > prices[i]) {
                curr = prices[i];
            }
            max = Math.max(max, prices[i] - curr);
        }
        return max;
    }
}
