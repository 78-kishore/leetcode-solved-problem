class Solution 
{
    public static boolean check(int n,int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
              return true;
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        List<Integer> li1=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            int n1=nums1[i];
            if(li1.contains(n1))
              continue;
            if(check(n1,nums2)==true)
                    li1.add(n1);
        }

        int n2=li1.size();
        int arr[]=new int[n2];
        for(int i=0;i<n2;i++)
           arr[i]=li1.get(i);
        
        return arr;
    }
}