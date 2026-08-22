class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr=s.split("[\\s,]+");
        // String nstring=new String(arr[arr.length-1]);
        // return nstring.length();
        s=s.trim();
        int i=s.length()-1;
        int count=0;
        while(i >= 0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }

}