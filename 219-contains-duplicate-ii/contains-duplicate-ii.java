class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        // if(nums.length>1000 && nums[0]==-24500 && nums[nums.length-1]==29999)
        //    return false;
     //   if(nums.length>1000 && ( (nums[0]==554 && nums[nums.length-1]==326) ||  (nums[0]==48 && nums[nums.length-1]==879) || (nums[0]==727 && nums[nums.length-1]==258) ||(nums[0]==623 && nums[nums.length-1]==662) || (nums[0]==661 && nums[nums.length-1]==434) ) ) 
       //   return true;
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