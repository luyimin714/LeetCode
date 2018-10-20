package Array;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profits = 0;
        for (int i = 0; i < prices.length-1; i++){
            if (prices[i+1] > prices[i])
                profits += prices[i+1] - prices[i];
        }
        return profits;
//        if(prices.length == 0)
//            return 0;
//        int valley = prices[0];
//        int peak = prices[0];
//        int i = 0;
//        int sum = 0;
//        while (i < prices.length-1){
//            while (i < prices.length-1 && prices[i] >= prices[i+1])
//                i++;
//            valley = prices[i];
//            while (i < prices.length-1 && prices[i+1] >= prices[i])
//                i++;
//            peak = prices[i];
//            sum += peak - valley;
//        }
//        return sum;
    }
}
