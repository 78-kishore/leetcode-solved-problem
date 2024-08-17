class Solution 
{
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String s[] = new String[nums.length];
        
        for(int i=0;i<n;i++)
        {
            s[i] =Integer.toString(nums[i]);
        }
        
        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));

        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<n;i++)
        {
            result.append(s[i]);
        }

        return result.charAt(0)=='0'?"0" : result.toString();
    }
}