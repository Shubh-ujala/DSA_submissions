class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n - 1;

        int area = -1;

        while(i < j){
            int height = Math.min(heights[i],heights[j]);
            int width = j - i;

            area = Math.max(area,width*height);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return area;
    }
}
