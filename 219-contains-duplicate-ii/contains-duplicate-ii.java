class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    int diff;
    for(int j=0;j<n;j++){
        if(map.containsKey(nums[j])){
            int i=map.get(nums[j]);
            if(Math.abs(i-j)<=k){
                return true;
            }
        }
        map.put(nums[j],j);
    }
    return false;
    }
}