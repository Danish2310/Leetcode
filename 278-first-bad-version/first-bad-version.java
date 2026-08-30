/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
        int firstpos=Integer.MAX_VALUE;
        while(l<=r){
            
            int mid=l+(r-l)/2;
            if(isBadVersion(mid)){
                r=mid-1;
                firstpos=Math.min(firstpos,mid);
            }
            else{
                l=mid+1;
            }
        }
        return firstpos;
    }
}