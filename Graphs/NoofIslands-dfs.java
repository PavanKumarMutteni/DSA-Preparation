/**
   
   https://leetcode.com/problems/number-of-islands/
   
*/
class Solution {
    
    public static void dfs(int i,int j,char[][] grid,int n,int m)
    {
        if(i<0 || j<0 || i>n-1 || j>m-1 || grid[i][j]!='1')
            return;
        grid[i][j]=2;
        dfs(i-1,j,grid,n,m);
        dfs(i+1,j,grid,n,m);
        dfs(i,j-1,grid,n,m);
        dfs(i,j+1,grid,n,m);
    }
    public int numIslands(char[][] grid) {
        
        int islands=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid,n,m);
                     islands++;
                }
               
            }
        }
        
        return islands;
        
    }
}
