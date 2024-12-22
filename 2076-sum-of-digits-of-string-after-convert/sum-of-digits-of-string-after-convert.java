class Solution 
{
    public static String isTransform(String ss)
    {
        int n=0;
        for(int i=0;i<ss.length();i++)
           n+=Integer.parseInt(""+ss.charAt(i));
        return ""+n;
    }  
    public int getLucky(String s, int k) 
    {
        HashMap<String, Integer> hp = new HashMap<>();
        int a=97,b=1;
        for(int i=0;i<26;i++)
        {
            hp.put(""+(char)a,b);
            a++;
            b++;
        }
        String s1="";
        for(int i=0;i<s.length();i++)
           s1+=(hp.get(""+s.charAt(i)));
        
        for(int i=0;i<k;i++)
            s1=""+isTransform(s1);

        return Integer.parseInt(s1);
    }
    
}