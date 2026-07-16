class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double MaxAvg=Integer.MIN_VALUE;
        double Avg=0;
        double sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(right-left+1 ==k){
                Avg=sum/k;
                MaxAvg=Math.max(Avg,MaxAvg);
                sum-=nums[left];
                left++;
            }
        }
        return MaxAvg;
        
    }
}