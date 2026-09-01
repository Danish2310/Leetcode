class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j=0;
        int i=0;
        while(i<n&&j<m){
            if(nums1[i]==nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOf(ans,k);
    }
}