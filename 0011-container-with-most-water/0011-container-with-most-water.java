class Solution {
    public int maxArea(int[] height) {
        int ans=-1;
        int i=0,j=height.length-1;
        while(i!=j){
            if(Math.min(height[i],height[j])*(j-i) > ans){
                ans = Math.min(height[i],height[j])*(j-i);
            }
            if (height[i]<height[j]){
                i++;
            }
            else
            {
                j--;
            }
        }
     return ans;
    }
}