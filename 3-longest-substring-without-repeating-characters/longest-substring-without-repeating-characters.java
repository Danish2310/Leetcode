class Solution {
    public int lengthOfLongestSubstring(String s) {
        int curlength=0 ,maxlength=0;
        Set<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                // curlength=right-left;
                // // set.clear();
                // curlength=set.size();
                // left=right;
                set.remove(s.charAt(left));
                curlength--;
                left++;
            }
            // curlength++;
            set.add(s.charAt(right));
            curlength=set.size();
            maxlength=Math.max(maxlength,curlength);
        } 
        return maxlength;
        
    }
}