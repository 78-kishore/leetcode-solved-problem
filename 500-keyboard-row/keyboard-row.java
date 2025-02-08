class Solution 
{
    public static boolean check(String s)
    {
        String one="QWERTYUIOPpoiuytrewq";
        String two="ASDFGHJKLlkjhgfdsa";
        String three="ZXCVBNMmnbvcxz";
        int a=0,b=0,c=0;

        for(int i=0;i<s.length();i++)
        {
            String s1=""+s.charAt(i);
            if(one.contains(s1))
               a++;
            if(two.contains(s1))
               b++;
            if(three.contains(s1))
               c++;
        }

        if(a==s.length() || b==s.length() || c==s.length())
           return true;
        else
           return false;
    }
    public String[] findWords(String[] words) 
    {

        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s1=words[i];
            if(check(s1)==true)
               li.add(s1);
        }
        
        int n=li.size();
        String sarr[]=new String[n];
        for(int i=0;i<n;i++)
              sarr[i]=li.get(i);
        
        return sarr;
    }
}