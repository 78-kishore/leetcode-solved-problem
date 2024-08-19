class Solution 
{
    public String isReverse(String s)
    {
        StringBuilder sr=new StringBuilder(s);
        sr.reverse();
        return sr.toString();
    }
    public String finalString(String s) 
    {
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++)
        {
            char c1=s.charAt(i);
            if(c1=='i')
                s1=isReverse(s1);
            else 
                s1+=c1;
        }
        return s1;
    }
}