class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int n=fruits.length;
        int max=0;
        for(int r=0;r<n;r++){
            int count=map.getOrDefault(fruits[r],0)+1;
            map.put(fruits[r],count);
            if(map.size()>2){
                // map.remove(fruits[l]);
                count=map.getOrDefault(fruits[l],0);
                map.put(fruits[l],count-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}


// int sum=r-l+1;
//  max=Math.max(sum,max);