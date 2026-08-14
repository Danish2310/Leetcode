class Solution {
    public int majorityElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int val=0;
        if(n==1){
            return nums[0];
        }
        for(int num:nums){
            if(map.containsKey(num)){
                int count=map.get(num);
                map.put(num,count+1);
                if(map.get(num)>max){
                    max=map.get(num);
                    val=num;
                }
            }
            else{
                map.put(num,1);
            }
            
        }
        return val;
    }
}