class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long countsum=0, maxsum=0;
        int left=0;
        Set<Integer> newset=new HashSet<> ();
        for(int right=0;right<nums.length;right++){
            while(newset.contains(nums[right]) || newset.size()==k){
                newset.remove(nums[left]);
                countsum=countsum-nums[left];
                left++;
            }
            countsum=countsum+nums[right];
            newset.add(nums[right]);
            if(newset.size()==k){
                maxsum=Math.max(countsum,maxsum);}
        }
        return maxsum;
        


        
    }
}