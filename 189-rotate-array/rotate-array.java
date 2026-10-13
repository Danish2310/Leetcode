class Solution {
    public void rotate(int[] nums, int k) {
        int index=0;
        int n=nums.length;
        int[] ans=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
            
            int sum=i+k;
            if(sum>=n){
                ans[index]=nums[i];
                index++;
            }
            else{
                ans[i+k]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            // System.out.print(ans[i]+",");
            nums[i]=ans[i];
        }
    }
}