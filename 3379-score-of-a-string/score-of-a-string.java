class Solution
 {
    public int scoreOfString(String s) 
    {
        int ans=0;
        if(s.length()==0)
        {
            return 0;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            int n1=s.charAt(i);
            int n2=s.charAt(i+1);
            int n3=Math.abs(n1-n2);
            ans+=n3;
        }
        return ans;
    }
}