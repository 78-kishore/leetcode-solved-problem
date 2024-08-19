class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int n=nums.length;
        int c=1;
        int e=nums[0];
        for(int i=0;i<n;i++)
        {
            if(e==nums[i])
                c++;
            else
            {
                c--;
                if(c==0)
                {
                    e=nums[i];
                    c++;
                }
            }
        }
        return e;
    }
}