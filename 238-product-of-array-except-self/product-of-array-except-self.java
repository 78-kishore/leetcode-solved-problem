class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        int n=nums.length;
        int arr[]=new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++)
            arr[i]=nums[i-1]*arr[i-1];
        int suff=1;
        for(int j=n-1;j>=0;j--)
            {
                arr[j]*=suff;
                suff*=nums[j];
            }
    return arr;
    }
}