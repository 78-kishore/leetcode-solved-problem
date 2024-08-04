class Solution {
    public boolean exist(char[][] arr, String word) 
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(Solve(arr,n,m,i,j,word,0)==true)
                {
                    return true;
                }
            }
        }
        return false;
        
        
    }  
    public boolean Solve(char[][]arr,int n,int m,int row,int col,String word,int i)
        {
            if(i==word.length())
            {
                return true;
            }
            if(row==-1||col==-1||row==n||col==m||arr[row][col]!=word.charAt(i))
            {
                return false;
            }
            else
            {
                char temp=arr[row][col];
                arr[row][col]='*';
                boolean res=Solve(arr,n,m,row-1,col,word,i+1)||
                            Solve(arr,n,m,row,col-1,word,i+1)||
                            Solve(arr,n,m,row,col+1,word,i+1)||
                            Solve(arr,n,m,row+1,col,word,i+1);
                arr[row][col]=temp;
                return res;
            }
        }
            
    
}
