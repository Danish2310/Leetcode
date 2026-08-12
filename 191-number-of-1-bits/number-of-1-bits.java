class Solution {
    public int hammingWeight(int n) {
        int[] arr=new int[32];
        int ind=0;
        while(n>0){
            arr[ind]=n%2;
            n/=2;
            ind++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
        
    }
}