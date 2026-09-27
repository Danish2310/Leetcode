class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int Maxcount=0;
        for(int num:nums){
            set.add(num);
        }
        for(int i:set){
            int count=0;
            if(!set.contains(i-1)){
                int current=i;
                
                while(set.contains(current)){
                    count++;
                    Maxcount=Math.max(count,Maxcount);
                    current++;
                }
            }
        }
        return Maxcount;
    }
}

        // if(nums.length==0){
        //     return 0;
        // }
        // for(int num:nums){
        //     set.add(num);
        // }
        // for(int i=0;i<n;i++){
        //     while(set.contains(++i)){
        //         count++;
        //         Maxcount=Math.max(count,Maxcount);
        //     }
        //     count=1;
        // }
        // return Maxcount;