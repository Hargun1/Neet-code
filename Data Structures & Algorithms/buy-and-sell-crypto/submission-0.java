class Solution {
    public int maxProfit(int[] prices) {
    int max =0;
    int buy = 0;
    
    for(int i = 1 ; i < prices.length; i ++){
        if(prices[i] - prices[buy] > max){
            max = prices[i] - prices[buy];
            
        }else if(prices[i] < prices[buy]){
            buy = i ;
        }
    }
    return max;
    }
}
