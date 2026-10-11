class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n=nums.length;
        int sum=0;
        int count=0;
        int l=0;
        Arrays.sort(nums);
        int r=n-1;
        while(l<=r){
            sum=nums[l]+nums[r];
            if(sum<=limit){
                l++;
            }
            r--;
            count++;
        }
        return count;
    }
}