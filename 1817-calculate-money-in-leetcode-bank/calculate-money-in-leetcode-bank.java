class Solution 
{
    public int totalMoney(int n) 
    {
        int a=1;
        int b=1;
        int c=7;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=a;
            if(a%c==0)
            {
                c++;
                b++;
                a=b;
                continue;
            }
            a++;
        }
        return sum;
    }
}