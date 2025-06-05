package StriversAtoZDSACourse.Arrays;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BuySellStocks buySellStocks = new BuySellStocks();
        System.out.println(buySellStocks.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
