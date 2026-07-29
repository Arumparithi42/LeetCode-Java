class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0; // minimum cost
        int r = 1; // maximum cost
        while(r != prices.length){
            if(prices[l] > prices[r]){ // not possible or loss
                l = r;
            }
            else{ // has profit
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            }
            r++;
        } 
        return max;
    }
}