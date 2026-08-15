class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int curr=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-prices[curr];
            if(prices[i]<prices[curr])
            curr=i;
            if(max_profit<profit)
            max_profit=profit;
        }
        return max_profit;
    }
}