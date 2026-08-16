class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet <Integer>set1=new HashSet<>();
        HashSet <Integer>set2=new HashSet<>();
        HashSet <Integer>set3=new HashSet<>();
        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);
        for(int n:nums3) set3.add(n);

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:set1) map.put(n,map.getOrDefault(n,0)+1);
        for(int n:set2) map.put(n,map.getOrDefault(n,0)+1);
        for(int n:set3) map.put(n,map.getOrDefault(n,0)+1);
        ArrayList<Integer>list=new ArrayList<>();
        // int index=0;
        for(int n:map.keySet()){
            if(map.get(n)>=2){
                list.add(n);
            }
        }
        return list;        
    }
}