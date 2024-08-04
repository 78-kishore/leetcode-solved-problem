import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> li=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            char []arr=str.toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==x)
                {
                    li.add(i);
                }
            }
        } 
        for(int num :li)
        {
            if(!ans.contains(num))
            {
                ans.add(num);
            }
        } 
        return ans;
        
    }
}