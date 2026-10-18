class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int higher=-1;
        // map.put(nums2[n2-1],-1);
        int[] ans=new int[n1];
        int index=0;
        for(int num:nums2){
            map.put(num,index);
            index++;           
        }
        int right=n2-1;
        for(int i=0;i<n1;i++){
            int left=map.get(nums1[i]);
            if(left==n2-1){
                ans[i]=-1;
                continue;
            }
            for(int j=left+1;j<=n2-1;j++){
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    j++;
                    break;
                }
                else{
                    ans[i]=higher;
                }
            }
        }
        return ans;
    }
}