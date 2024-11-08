class Solution 
{
    public int calPoints(String[] operations) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        int sn=operations.length;

        for(int i=0;i<sn;i++)
        {
            String s1=operations[i];
            char c1=s1.charAt(0);

            if(c1=='C')
                al.remove(al.size()-1);
            else if(c1=='+')
                al.add( al.get(al.size()-1) + al.get(al.size()-2) );
            else if(c1=='D')   
                al.add( 2* al.get(al.size()-1) );
            else
                al.add(Integer.parseInt(s1));
         }

         if(al.size()==0)
           return 0;
         else
         {
            int a=0;
            for(int i=0;i<al.size();i++)
                 a+=al.get(i);
            return a;
         }

    }
}