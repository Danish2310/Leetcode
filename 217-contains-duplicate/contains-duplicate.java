class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int l=0;l<nums.length-1;l++){
            int r=l+1;
            if(nums[l]==nums[r]){
                return true;
            }
            // else{
            //     l++;
            //     r++;
            // }

        }
        return false;
        
    }
}