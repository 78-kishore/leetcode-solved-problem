class Solution 
{
    public boolean isSelfDiv(int i)
    {
        boolean a=true;
        int n1=i;
        while(n1!=0)
        {
            int rem=n1%10;
            if(rem==0 || i%rem!=0 )
            {
                a=false;
                break;
            }
            n1/=10;
        }
        return a;
    }
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDiv(i)==true)
               li.add(i);
        }
        return li;
    }
}