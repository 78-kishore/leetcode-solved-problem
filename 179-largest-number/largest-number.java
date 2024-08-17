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

        StringBuilder lnum = new StringBuilder();
        
        for(int i=0;i<nn;i++)
        {
            lnum.append(s[i]);
        }

        if(lnum.charAt(0)=='0') 
           return "0";
        else
           return lnum.toString();
    }
}