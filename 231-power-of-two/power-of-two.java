class Solution {
    public boolean isPowerOfTwo(int n) {
        int arr[]=new int[32];
        int index=0;
        while(n>0){
            arr[index]=n%2;
            n/=2;
            index++;
        }int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}