class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer>set1=new HashSet<>();
        HashSet <Integer>set2=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        int newarr[]=new int[n];
        for(int i=0;i<n;i++){
            set1.add(nums1[i]);
        }
        int index=0;
        for(int i=0;i<m;i++){
            // set1.add(nums1[i]);
            if(set1.contains(nums2[i])){
                newarr[index]=nums2[i];
                set1.remove(nums2[i]);
                index++;
            }

        }
        return Arrays.copyOf(newarr, index);
        
        
    }
}