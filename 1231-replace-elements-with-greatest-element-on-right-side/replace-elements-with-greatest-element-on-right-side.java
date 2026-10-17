class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int [] ans=new int[n];
        // ans[n-1]=-1;
        // int higher=Integer.MIN_VALUE;
        int higher=-1;
        for(int i=n-1;i>=0;i--){
            ans[i]=higher;
            if(higher<=arr[i]){
                higher=Math.max(higher,arr[i]);
            }
        }
return ans;
    }
}