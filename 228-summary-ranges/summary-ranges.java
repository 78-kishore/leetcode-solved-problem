class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
       int n=nums.length;
       List<String> li=new ArrayList<>();
       String s1="";
       if(n==0)
         return li;
       else if(n==1)
        {
            s1=""+nums[0];
            li.add(s1);
            return li;
        }
       int a=nums[0],b=nums[0];
       for(int i=1;i<n;i++)
       {
           if(nums[i]==(nums[i-1]+1))
           {
            b=nums[i];
           }
           else
           {
            if(a!=b)
            {
               s1=a+"->"+b;
               li.add(s1);
               s1="";
               a=nums[i];
               b=nums[i];
            }
            else if(a==b)
              {
                s1=""+a;
                li.add(s1);
                s1="";
                a=nums[i];
                b=nums[i];
              }
           }
           if(i==n-1)
            {
                if(a!=b)
                {
                   s1=a+"->"+b;
                   li.add(s1); 
                }
                else if(a==b)
                {
                     s1=""+a;
                    li.add(s1);
                }
            }
       }
       return li;
    }
}