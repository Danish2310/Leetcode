class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;
        int right=height.length-1;
        // for(int left=0;left<height.length;left++)
        while(left<right){
            int area=Math.min(height[left],height[right]) * (right-left);
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        } 
        return maxarea;
    }
}