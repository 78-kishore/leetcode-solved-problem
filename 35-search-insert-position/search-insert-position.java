class Solution
 {
    public int searchInsert(int[] nums, int target)
     {
        int n=nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                a++;
                b=i;
                break;
            }
               
        }
        if(a==0)
        {
            for(int i=0;i<n;i++)
            {
                if(target<nums[i])
                {
                    b=i;
                    break;
                }
                  
            }
        }
        if(b==0 && target<nums[0])
           return 0;
        else if(b==0 && target>nums[n-1])
           return n;
        else
           return b;  
    }
}