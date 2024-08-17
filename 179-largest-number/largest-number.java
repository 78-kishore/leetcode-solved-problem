class Solution 
{
    public String largestNumber(int[] nums) 
    {
        int nn=nums.length;
        String s[] = new String[nn];
        
        for(int i=0;i<nn;i++)
        {
            s[i] =Integer.toString(nums[i]);
        }
        
        Arrays.sort(s,(n,k) -> (k+n).compareTo(n+k));

        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<nn;i++)
        {
            result.append(s[i]);
        }

        return result.charAt(0)=='0'?"0" : result.toString();
    }
}