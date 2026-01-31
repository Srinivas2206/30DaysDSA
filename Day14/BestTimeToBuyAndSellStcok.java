package Day14;

public class BestTimeToBuyAndSellStcok {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int pick = prices[0];
        for (int price : prices) {
            if (price < pick) {
                pick = price;
            } else {
                maxProfit = Math.max(maxProfit, price - pick);
            }
        }
        return maxProfit;
    }
}
