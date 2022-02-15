/**

   https://leetcode.com/problems/rotting-oranges/

*/
class Pair
{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
   public static boolean isSafe(int i,int j,int n,int m)
   {
       return (i>=0 && i<n && j>=0 && j<m);
   }
    public int orangesRotting(int[][] grid) {
        
        int oranges=0;
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                    oranges++;
                }
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                }
            }
        }
        int ans=0;
        while(q.size()!=0)
        {
            int size=q.size();
            while(size-->0)
            {
                
                Pair p=q.poll();
                oranges--;
                int row=p.first;
                int col=p.second;
                int d[]={0,1,0,-1,0};
                for(int k=0;k<4;k++)
                {
                    if(isSafe(row+d[k],col+d[k+1],n,m) && grid[row+d[k]][col+d[k+1]]==1)
                    {
                        grid[row+d[k]][col+d[k+1]]=2;
                        q.add(new Pair(row+d[k],col+d[k+1]));
                    }
                }
            }
            if(q.size()!=0)
                ans++;
        }
        if(oranges==0) return ans;
        return -1;
        
    }
}
