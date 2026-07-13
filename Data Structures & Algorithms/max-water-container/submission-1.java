class Solution {
    public int maxArea(int[] heights) {
       int i = 0;
       int j = heights.length - 1;
       int maxArea = 0;
       while(i<j){
        int left = heights[i];
        int right = heights[j];
        int area = Math.min(left ,right ) * ( j - i);
        maxArea = Math.max(maxArea ,area);
        if(left < right){
            i++;
        }else{
            j--;
        }
       }
       return maxArea;
    }
}
