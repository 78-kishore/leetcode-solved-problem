class Solution 
{
    public int singleNumber(int[] nums)
    {
        int n=nums.length;
        int element=0;
        for(int i=0;i<n;i++)
        {
            int a=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                   a++;
            }
            if(a==1)
               {
                element=i;
                break;
               }
        }
        return nums[element];
    }
}