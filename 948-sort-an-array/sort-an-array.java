class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
              arr[i]=nums[i];
        }
        return arr;
    }
}