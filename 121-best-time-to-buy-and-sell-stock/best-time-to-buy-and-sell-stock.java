class Solution {
    public int maxProfit(int[] prices) {
        int selling_day=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;
        int diff=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<selling_day){
                selling_day=prices[i];
            }
            diff=prices[i]-selling_day;
            maxprofit=Math.max(maxprofit,diff);
        }
        return maxprofit;
        }
    
}