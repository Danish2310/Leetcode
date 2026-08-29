class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
                int count=map.getOrDefault(s.charAt(i),0)+1;
                map.put(s.charAt(i),count); 
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int count=map.getOrDefault(t.charAt(i),0)-1;
                map.put(t.charAt(i),count);
            
            if(count==0){
                map.remove(t.charAt(i));
            }}
        }
        if(map.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}