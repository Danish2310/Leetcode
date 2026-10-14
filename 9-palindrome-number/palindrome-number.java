class Solution {
    public boolean isPalindrome(int x) {
        // 
        if(x<0){
            return false;
        }
        int rev=0;
        int num=x;
        while(num!=0){
            // int rev=0;
            int digit=num%10;
            rev=rev*10 + digit;
            num=num/10;
        }
        if(x==rev){
            return true;
        }
        else{
        return false;
        }
    }
}

// String str=Integer.toString(x);
        // int l=0;
        // int r=str.length()-1;
        // while(l<r){
        //     if(str.charAt(l)!=str.charAt(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;