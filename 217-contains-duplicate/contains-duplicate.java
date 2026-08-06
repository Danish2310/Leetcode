class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int l=0;l<n-1;l++){
            int r=l+1;
            if(nums[l]==nums[r]){
                return true;
            }
            // else{

            // }
        }
        return false;


        
    }
}

        // int n=nums.length;
        // Set<Integer> set=new HashSet<>();
        // for(int l=0;l<n;l++){
        //     if(set.contains(nums[l])){
        //         return true;
        //     }
        //     else{
        //         set.add(nums[l]);
        //     }
        // }
        // return false;