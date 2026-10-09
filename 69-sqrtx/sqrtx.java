class Solution {
    public int mySqrt(int x) {
        long l=0;
        long r=x;
        while(l<=r){
            long mid=l+(r-l)/2;
            long sqr=mid*mid;
            if(sqr==x){
                return (int) mid;
            }
            else if(sqr>x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int) r;
    }
}