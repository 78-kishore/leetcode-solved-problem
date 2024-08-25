class Solution 
{
    public double minimumAverage(int[] nums)
     {
        int n=nums.length;
      Arrays.sort(nums);
      double c=0.0;
      for(int i=0,j=n-1;i<n/2;i++,j--)
      {
        if(i==0)
        {
            c=(double)(nums[i]+nums[j])/2;
            continue;
        }
        if(((nums[i]+nums[j])/2)<c)
            c=(double)(nums[i]+nums[j])/2;
      }
      return c;
    }
}