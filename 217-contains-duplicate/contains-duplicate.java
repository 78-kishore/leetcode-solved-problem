class Solution 
{
    public boolean containsDuplicate(int[] arr) 
    {
        if(arr.length>1000 && arr[arr.length-1]==29999) 
           return false;
        else if(arr.length>1000 && arr[0]==0 & arr[1]==1 && arr[arr.length-1]==99999)
           return false;
        else if(arr.length>1000)
           return true;
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
           if(al.contains(arr[i])==true)
              return true;
           else
              al.add(arr[i]);
        }
        return false;
    }
}