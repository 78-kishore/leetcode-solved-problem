class Solution 
{
    public int lengthOfLastWord(String s)
     {
        int n=s.length();
        int ans=0;
        int a=0;
        for(int i=n-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z'))
               a++;

            if(c==' ' && a>0)
              break;
            else if(c==' ' && a==0)
              continue;
            else
              ans++;
              
        }
       return ans;
     }
}