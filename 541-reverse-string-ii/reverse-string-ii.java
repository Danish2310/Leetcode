class Solution {
    public String reverseStr(String s, int k) {

        // Convert String to char array because Strings are immutable
        char[] arr = s.toCharArray();

        // Process every 2k block
        for (int i = 0; i < arr.length; i += 2 * k) {

            int left = i;

            // Reverse only up to k characters (or whatever remains)
            int right = Math.min(i + k - 1, arr.length - 1);

            // Two-pointer reversal
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Convert back to String
        return new String(arr);
    }
}