package Day18;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int pick = prices[0];
        for (int price : prices) {
            if (price < pick) {
                pick = price;
            }
            profit = Math.max(profit, price - pick);
        }
        return profit;
    }
}
