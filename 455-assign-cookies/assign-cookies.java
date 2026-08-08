class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=0;
        int count=0;

        for(int j=0;i<m&&j<n;j++){
            if(g[i]<=s[j]){
                count++;
                i++;
            }
        }
       
        return count;
    }
} 
// Set<Integer> set=new HashSet<>();
        // for(int i=0;i<g.length;i++){
        //     set.add(g[i]);
        // }
        // for(int j =0;j<s.length;j++){
        //     if(set.contains(s[j])){
        //         count++;
        //         set.remove(s[j]);
        //     }
        // }