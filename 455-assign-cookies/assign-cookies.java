class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        int count=0;
        int i=0;

        Arrays.sort(g);
        Arrays.sort(s);
        for(int j=0;i<m&&j<n;j++){
            if(g[i]<=s[j]){
                count++;
               
                // if(i+1<g.length){
                //     i++; 
                // }
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