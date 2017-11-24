package java;

/**
 * Created by 张超 on 2017/11/24.
 */
//QUESTION:
//    Say you have an array for which the ith element is the price of a given stock on day i.
//    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
//    design an algorithm to find the maximum profit.
public class BestTimetoBuyandSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int xMin=10000;
            int xDiff=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<xMin){
                    xMin=prices[i];
                }else{
                    if(xDiff<prices[i]-xMin){
                        xDiff=prices[i]-xMin;
                    }
                }
            }
            return xDiff;
        }
    }
}
