class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        // int initial=prices[0];
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                int diff=prices[i+1]-prices[i];
                profit+=diff;
            }





            
        }
        return profit;
    }
}
// int diff=initial-prices[i];
            // initial++;
            // if(diff<0){
            //     profit+=diff;
            // }