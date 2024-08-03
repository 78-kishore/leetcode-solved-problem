import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        Arrays.sort(capacity);
        int sum=0;
        int count=1;
        for(int i=0;i<apple.length;i++)
        {
            sum+=apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--)
        {
            int bal=sum-capacity[i];
            if(bal<=0)
            {
                break;
            }
            count++;
            sum=bal;
        }
        return count;

    }
}