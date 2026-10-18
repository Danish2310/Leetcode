class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        boolean[] freq=new boolean[n+1];
        // int[] ans=new int[n];
        List<Integer> list=new ArrayList<>();
        int index=0;
        // another we can do with int array only by incresing count for each value appeared;
        for(int i=0;i<n;i++){
            if(freq[nums[i]] != false){
                list.add(nums[i]);
            }
            else{
                freq[nums[i]] = true;
            }
        }
        return list;
    }
}