class Solution
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        int n=heights.length;
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        for(int i=0;i<n;i++)
        {
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            names[i]=hm.get(heights[j]);
        }
        return names;
    }
}