class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        // if(ans==0){
            return ans;
        // }
        // else{
        //     return ans;
        // }
    }
}
// Arrays.sort(nums);
        // if(n==1){
        //     return nums[0];
        // }
        // // int l=0;
        // for(int r=1;r<n;r+=2){
        //     int l=r-1;;
        //     // int k=nums[l] ^ nums[l];
        //     if(nums[l]!=nums[r]){
        //         return nums[l];

        //     }
        //     // else{
        //     //     return nums[l];
        //     // }
        // }
        // return nums[n-1];