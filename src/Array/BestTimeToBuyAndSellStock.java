package Array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfits = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxProfits)
                maxProfits = prices[i] - minprice;
        }
        return maxProfits;
//        int maxProfits = 0;
//        for (int i = 0; i < prices.length-1; i++){
//            for (int j = i+1; j < prices.length; j++){
//                int profits = prices[j] - prices[i];
//                maxProfits = Math.max(maxProfits,profits);
//            }
//        }
//        return maxProfits;
    }
}
