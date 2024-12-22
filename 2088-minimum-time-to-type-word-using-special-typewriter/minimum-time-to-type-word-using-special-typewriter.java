class Solution 
{
    public int minTimeToType(String word) 
    {
        int n=0;
        
        int k=word.charAt(0);
        k=Math.abs(k-97);
        if(k>13)
          n+=(26-k);
        else
          n+=k;

        for(int i=0;i<word.length()-1;i++)
        {
            int a=(int)word.charAt(i);
            int b=(int)word.charAt(i+1);
            int c=Math.abs(a-b);
            if(c>13)
              n+=(26-c);
            else
              n+=c;
        }
        n+=word.length();
        return n;
    }
}