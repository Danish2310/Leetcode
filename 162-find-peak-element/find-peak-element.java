class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid+1<n && nums[mid]<nums[mid+1]){
                ans=mid+1;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
}