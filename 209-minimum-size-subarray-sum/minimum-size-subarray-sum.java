class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // List<int[]> list = new ArrayList<>();
        int minlength=Integer.MAX_VALUE;
        int currlength=0;
        int sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                currlength=(right-left)+1;
                minlength=Math.min(minlength,currlength);
                sum-=nums[left];
                left++;
            }
                }
        if (minlength == Integer.MAX_VALUE) {
    return 0;
} else {
    return minlength;
} 
        
    }
}