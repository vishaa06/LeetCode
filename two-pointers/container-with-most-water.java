class Solution {
    public int maxArea(int[] height) {
        int area=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            int w=Math.min(height[left],height[right]);
            int l=right-left;
            if((w*l)>area)
                area=w*l;
            if(height[left]>height[right])
            {
                right--;
            }
            else if(height[right]>height[left])
            {
                left++;
            }
            else
            {
                left++;
            }
        }
        return area;
    }
}