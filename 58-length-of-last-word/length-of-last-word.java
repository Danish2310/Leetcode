class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split("[\\s,]+");
        String nstring=new String(arr[arr.length-1]);
        return nstring.length();
    }
}