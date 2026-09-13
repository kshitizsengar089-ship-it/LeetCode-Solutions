class Solution {
    public int maxArea(int[] height) {
        
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        int area;
        while(start<end)
        {
           area= Math.min(height[start],height[end])*(end-start);
            if(height[start]>height[end])
            {  
                end--;
            }
            else{  
                start++;
            }
             maxArea=Math.max(area,maxArea);
        }
        return maxArea;   
    }       
           
}