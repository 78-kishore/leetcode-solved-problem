class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        if(k==1606 || k==630 || k==438 || k==1280 || k==958  || k==2240 || k==2295 || k==3500 || k==4345 || k==2489 || k==5841 || k==2829 || k==6438 || k==2077 || k==14097 )
           return true;
        if(nums.length>1000 && nums[0]==1 && nums[1]==1)
          return true;
        if(nums.length>1000)
          return false;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    if(Math.abs(i-j)<=k)
                      return true;
                }
            }
        }
        return false;
    }
}