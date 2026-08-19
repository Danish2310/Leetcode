class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] sortarray=Arrays.copyOf(heights,heights.length);
        Arrays.sort(sortarray);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sortarray[i]){
                count++;
            }
        }
        return count;
        
        
    }
}

// int[] sortedArray = Arrays.copyOf(original, original.length);

//         // 2. Sort the new array in-place
//         Arrays.sort(sortedArray);