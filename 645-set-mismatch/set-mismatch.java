class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int duplicate=0;
        int missing=0;
        for(int num:nums){
            if(set.contains(num)){
                // return new int[]{num,num+1};
                duplicate=num;
                // break;
            }
            set.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                missing=i;
                break;
            }
        }

        return new int[]{duplicate,missing};
    }
}