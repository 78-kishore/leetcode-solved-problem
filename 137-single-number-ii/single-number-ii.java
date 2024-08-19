class Solution 
{
    public int singleNumber(int[] nums)
    {
        int n=nums.length;
        int a=0,i=0,j=0;

        while(i<n)
        {
            if(nums[i]==nums[j])
                a++;
            
            if(j==n-1)
            {
                if(a==1)
                {
                    a=i;
                    break;
                }
                else
                {
                    a=0;
                    i++;
                    j=0;
                    continue;
                }
            }
            else
                j++;
        }
        return nums[a];
    }
       
}