class Solution {
    public char repeatedCharacter(String s) {
        String copy=new String(s);
        // HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            // int count=map.getOrDefault(s.charAt(i),0)+1;
            // map.put(s.charAt(i),count);
            // if(map.getOrDefault(copy.charAt(i),0)==2){
            //     return copy.charAt(i);
            // }
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }

        return ' ';
        
    }
}