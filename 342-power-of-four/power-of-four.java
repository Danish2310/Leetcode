class Solution {
    public boolean isPowerOfFour(int n) {
        // logic: i first check the position of set bit  by using n&(1<<i) then note the position (k=i) and do n>0 and n&(n-1)==0 and k%2==0
        int k=-1;
        for(int i=0;i<31;i++){
            if((n & (1<<i))!=0){
                k=i;
                break;
            }
        }
        if((n>0) && (k%2==0) && (n&(n-1))==0){
            return true;
        }
        return false;
    }
}