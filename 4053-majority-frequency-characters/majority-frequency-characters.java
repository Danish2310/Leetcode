class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char num:s.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,List<Character>> group_map=new HashMap<>();
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            group_map.putIfAbsent(freq,new ArrayList<>());
            group_map.get(freq).add(ch);
        }
        int maxsize=0;
        int bestfreq=0;
        for(int freq:group_map.keySet()){
            int size=group_map.get(freq).size();
            if(size>maxsize || (size==maxsize && freq>bestfreq)){
                maxsize=size;
                bestfreq=freq;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:group_map.get(bestfreq)){
            ans.append(ch);
        }
        return ans.toString();

        
    }
}