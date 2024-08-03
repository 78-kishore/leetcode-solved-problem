class Solution {
    public String defangIPaddr(String address) {
        String s2="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
                s2+="[.]";
            else 
                 s2+=address.charAt(i);
        }
        return s2;
    }
}