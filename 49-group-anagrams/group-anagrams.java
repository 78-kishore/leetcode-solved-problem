class Solution
 {
    public List<List<String>> groupAnagrams(String[] arr)
    {
        int n=arr.length;
        List<List<String>> fin=new ArrayList<>();
        HashMap<String,List<String>> hp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String s1=arr[i];
            char[] c1=s1.toCharArray();
            Arrays.sort(c1);
            String s2=Arrays.toString(c1);
            if(hp.containsKey(s2))
            {
                List<String> li1=hp.get(s2);
                li1.add(s1);
                hp.put(s2,li1);
            }
            else
            {
                List<String> li1=new ArrayList<>();
                li1.add(s1);
                hp.put(s2,li1);
            }
        }
        for(List<String> li2:hp.values())
             fin.add(li2);
        
        return fin;
    }
}