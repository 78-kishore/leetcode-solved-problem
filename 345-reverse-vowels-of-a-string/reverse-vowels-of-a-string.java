class Solution
 {
    public boolean isVowel(char ch)
    {
        if((ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' ||
            ch == 'O' || ch == 'u' || ch == 'U'))
             return true;
        else
             return false;
    }
    public String reverseVowels(String s) 
    {
        int j=s.length()-1;
        int i=0;
        char c[]=s.toCharArray();
        while(i<=j)
        {
            char c1=c[i];
            char c2=c[j];

            if(isVowel(c1)==true && isVowel(c2)==true)
            {
                char temp=c1;
                c[i]=c2;
                c[j]=temp;
                i++;
                j--;
            }

            if(isVowel(c1)==true && isVowel(c2)==false)
                j--;
            if(isVowel(c1)==false && isVowel(c2)==true)
                i++;
            
            if(isVowel(c1)==false && isVowel(c2)==false)
            {
                i++;
                j--;
            }
        }
        String s2=new String(c);
        return  s2;
    }
}