class Solution 
{
    public int missingNumber(int[] nums)
     {
        int n=nums.length;
        int a=0;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==n-1)
            {
                if(nums[i-1]==nums[i]-1)
                    continue;
                else
                {
                    a++;
                    ans=nums[i]-1;
                    break;
                }
            }
            else if(nums[i+1]==nums[i]+1)
               continue;
            else
            {
                a++;
              ans=nums[i]+1;
              break;
            }
               
        }
        if(a==0)
        {
            if(nums[0]==0)
                return nums[n-1]+1;
        }
        return ans;
    }
}