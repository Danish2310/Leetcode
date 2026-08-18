class Solution {
    public int addDigits(int num) {
       while(num>=10){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        num=sum;
       }
        return num;
        
    }
}
//  int minsum=Integer.MAX_VALUE;
//         int cursum=0;
//         if(num<10){
//             return num;
//         }
//         while (minsum >= 10){
//             cursum=(num%10) + (num/10) ;
//             num=cursum;
//             minsum=Math.min(minsum,cursum);
//         }