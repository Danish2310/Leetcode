class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // 1. Find the carry bits
            int carry = a & b;
            
            // 2. Add bits where there is no carry
            a = a ^ b;
            
            // 3. Shift the carry to the left to add it in the next iteration
            b = carry << 1;
        }
        return a;
    }
}
