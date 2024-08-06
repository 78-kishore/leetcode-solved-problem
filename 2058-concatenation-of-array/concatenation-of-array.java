class Solution 
{
    public int[] getConcatenation(int[] nums)
     {
       int n=nums.length;
       int m=n*2;
       int []arr=new int[m]; 
       for(int i=0;i<n;i++)
       {
        arr[i]=nums[i];
       }
       for(int i=n,j=0;i<m;i++,j++)
       {
        arr[i]=nums[j];
       }
       return arr;

    }
}