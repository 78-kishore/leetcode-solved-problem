class Solution
 {
    public int maxArea(int[] height)
    {
        int l=0,ans=0,r=height.length-1;
         while(l<r)
         {
            int h=Math.min(height[l],height[r]);
            ans=Math.max(ans,(h*(r-l)));
            if(height[l]<height[r])
                 l++;
            else
                 r--;
         }
         return ans;
    }
}