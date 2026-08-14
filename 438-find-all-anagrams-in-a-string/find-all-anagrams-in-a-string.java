class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char sh=t.charAt(i);
            freq[ch-'a']++;
            freq[sh-'a']--;
            
        }
        // int num=0;
        for(int num :freq){
            if(num!=0){
                return false;
            }
            // else{
            //     return true;
            // }
        }
        return true; }
    
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        ArrayList<Integer> list=new ArrayList<>();
        int l=0;
        // int r=0;

        for(int r=0;r<n;r++){
                if(r-l+1==k){
                    String sub=s.substring(l,r+1);
                    if(isAnagram(sub,p)){
                        list.add(l);
                        // l++;
                    }
                    l++;   
                }
        }
        return list;
        
    }
}