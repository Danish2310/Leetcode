class Solution {
    public int firstUniqChar(String s) {
        String copy=new String(s);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count=map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),count);
        }
        for(int i=0;i<copy.length();i++){
            if(map.getOrDefault(copy.charAt(i),0)==1){
                return i;
            }
            // else{
            //     return -1;
            // }
        }
        return -1;
    }
}