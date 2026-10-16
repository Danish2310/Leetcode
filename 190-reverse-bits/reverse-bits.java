class Solution {
    public int reverseBits(int n) {
        // String p=Integer.parseInt(n,2);
        
        String p=Integer.toBinaryString(n);
        while (p.length() < 32) {
           p = "0" + p;
}
        StringBuilder sb=new StringBuilder(p);
        sb.reverse();
        String q=sb.toString();
        long c=Long.parseLong(q,2);
        return (int)c;
    }
}

