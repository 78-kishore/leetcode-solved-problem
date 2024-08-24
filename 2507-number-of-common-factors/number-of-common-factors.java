class Solution 
{
    public int commonFactors(int a, int b) 
    {
        int aa=0,c=0;
        if(a>b)
           aa=b;
        else if(a<b)
           aa=a;
        else
           aa=a;

        for(int i=1;i<=aa;i++)
        {
            if(a%i==0 && b%i==0)
                c++;
        }
        return c;
    }
}