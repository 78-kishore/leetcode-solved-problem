class Solution 
{
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) 
    {
        int a=0;
        a= arrivalTime + delayedTime ;
        if(a>24)
            a=a-24;
        else if(a==24)
            a=0;
     return a;
    }
}