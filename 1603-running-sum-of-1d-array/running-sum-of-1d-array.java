class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        // int j=1;
        for(int i=0;i<n;i++){
            if(i==0){
            arr[0]=nums[0];}
            else{
            
            arr[i]=arr[i-1]+nums[i];
            // j++;
            }

        }
        
        return arr;
    }
}