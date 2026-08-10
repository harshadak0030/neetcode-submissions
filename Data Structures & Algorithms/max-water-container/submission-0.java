class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high = heights.length-1;
        int area;
        int maxA=0;
        while(low< high){
             area = (high - low) * Math.min(heights[low] ,heights[high]);
        if(area>maxA){
            maxA=area;
        }
        if(heights[low]<heights[high]){
            low++;
        }
        else{
            high--;
        }
        }
        return maxA;

    }
}
