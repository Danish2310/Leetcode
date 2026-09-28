class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int k=n/3;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            // if(map.get(num))
        }
        for(int i:map.keySet()){
            if(map.get(i)>k){
                list.add(i);
            }
        }
        return list;
    }
}