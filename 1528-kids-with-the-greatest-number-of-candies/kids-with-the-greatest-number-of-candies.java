class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int n=candies.length;
        List<Boolean> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                  continue;

                if(candies[i]+extraCandies>=candies[j])               
                    a++;
            }
            if(a==n-1)
               li.add(true);
            else
               li.add(false);
        }
        return li;
        
    }
}