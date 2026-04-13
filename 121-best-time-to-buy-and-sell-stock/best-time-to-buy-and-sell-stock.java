class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else{
                int profit= prices[i]-buy;
                sell = Math.max(sell,profit);
            }
        }
        return sell;
    }
}