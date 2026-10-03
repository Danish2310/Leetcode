class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int first_xor=0;
        int second_xor=0;
        for(int i=0;i<=n;i++){
            first_xor^=i;
            // second_xor^=nums[i];
        }
            for(int i=0;i<n;i++){
            // first_xor^=i;
            second_xor^=nums[i];
        }
        return first_xor ^ second_xor;
        
        // return ans;
        
    }
}