class Solution {
    public int addDigits(int num) {
        int minsum=Integer.MAX_VALUE;
        int cursum=0;
        if(num<10){
            return num;
        }
        while (minsum >= 10){
            cursum=(num%10) + (num/10) ;
            num=cursum;
            minsum=Math.min(minsum,cursum);
        }
        return minsum;
        
    }
}