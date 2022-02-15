/**
  
  https://leetcode.com/problems/number-of-islands/

*/
class Solution {
    
    public int numIslands(char[][] grid) {
        
        int islands=0;
        int n=grid.length;
        int m=grid[0].length;
         Queue<int []>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                   
                    q.add(new int[]{i,j});
                    grid[i][j]='2';
                    while(q.size()!=0)
                    {
                        int a[]=q.remove();
                        int row=a[0];
                        int col=a[1];
                       // q.remove();
                        //grid[row][col]='2';
                        if(row-1>=0 && row-1<=n-1 && grid[row-1][col]=='1'){
                            q.add(new int[]{row-1,col});
                             grid[row-1][col]='2';
                        }
                        if(row+1>=0 && row+1<=n-1 && grid[row+1][col]=='1'){
                            q.add(new int[]{row+1,col});
                             grid[row+1][col]='2';
                        }
                        if(col-1>=0 && col-1<=m-1 && grid[row][col-1]=='1'){
                            q.add(new int[]{row,col-1});
                             grid[row][col-1]='2';
                        }
                        if(col+1>=0 && col+1<=m-1 && grid[row][col+1]=='1'){
                            q.add(new int[]{row,col+1});
                             grid[row][col+1]='2';
                        }
                        
                        
                    }
                    islands++;
                    
                }
               
            }
        }
        
        return islands;
        
    }
}
