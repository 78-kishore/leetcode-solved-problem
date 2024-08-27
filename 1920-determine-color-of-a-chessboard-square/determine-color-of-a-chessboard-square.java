class Solution 
{
    public boolean squareIsWhite(String coordinates) 
    {
        int n1=(int) coordinates.charAt(0);
        int n2=Integer.parseInt(Character.toString(coordinates.charAt(1)));
        boolean a=true;

        if(n1%2!=0)
        {
            if(n2%2!=0)
                 a=false;
            else
                 a=true;
        }
        else
        {
            if(n2%2!=0)
                a=true;
            else
                a=false;
        }
        return a;
    }
}