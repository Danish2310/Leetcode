class Solution {
    public boolean caneat(int[] piles,int H,int h){
        long combinedsum=0;
        for(int i=0;i<piles.length;i++){
            combinedsum+=(piles[i]+H-1)/H;
        }
        if(combinedsum<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int r=0;
        for(int pile:piles){
            r=Math.max(pile,r);
        }
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(caneat(piles,mid,h)){
                ans=Math.min(mid,ans);
                r=mid-1;
            }
            else{
                 l=mid+1;
            }
        }
        return ans;
    }
}