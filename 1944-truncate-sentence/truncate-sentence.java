class Solution
{
    public String truncateSentence(String s, int k)
     {
       int n1=s.length();
       String s1="";
       for(int i=0;i<n1;i++)
       {
         char c=s.charAt(i);
         if(c==' ')
            k--;
         if(k==0)
           break;
         s1+=c;
       } 
       return s1;
    }
}