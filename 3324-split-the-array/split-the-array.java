class Solution 
{
    public boolean isPossibleToSplit(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int a=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    a++;
            }
            if(a>2)
              return false;
        }
        return true;
    }
}