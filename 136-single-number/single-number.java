class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                  ans++;
            }
            if(ans==1)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}