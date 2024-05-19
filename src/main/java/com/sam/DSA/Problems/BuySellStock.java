package com.sam.DSA.Problems;

public class BuySellStock {
//    Input: prices= [7,1,5,3,6]
//    Output: 5

    public int buySellStock(int[] prices) {
        if (prices.length<2) {
            return 0;
        }
        int minPrice = prices[0];
        int calculatedProfit = 0;

        for(int i=1;i<prices.length;i++){
            calculatedProfit = Math.max(calculatedProfit,prices[i]-minPrice);
            minPrice = Math.min(minPrice ,prices[i]);
        }
        return calculatedProfit;
    }

}
