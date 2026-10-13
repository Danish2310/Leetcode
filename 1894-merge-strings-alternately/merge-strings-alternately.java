class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        int l1=0;
        int l2=0;
        for(int i=0;i<n+m;i++){
            if(l1<n){
            sb.append(word1.charAt(l1));}
            if(l2<m){sb.append(word2.charAt(l2));}
            l1++;
            l2++;
        }
        String str=sb.toString();
        return str;

    }
}