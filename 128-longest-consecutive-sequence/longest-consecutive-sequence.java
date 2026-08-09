class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int num:nums){
            set.add(num);
        }
        int longest=1;
        if(set.size()==0){
            return 0;
        }else{
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                 longest=Math.max(longest,length);
            }
        }
        return longest;

        }
    }
}