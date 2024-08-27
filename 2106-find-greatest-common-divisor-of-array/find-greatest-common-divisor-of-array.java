class Solution 
{
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int n1=nums[0];
        int n2=nums[nums.length-1];
        int a=0;
        for(int i=n1;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                a=i;
                break;
            }
        }
        return a;
    }
}