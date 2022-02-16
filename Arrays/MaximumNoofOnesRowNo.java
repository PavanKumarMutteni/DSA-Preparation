//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java
/**
 
 https://practice.geeksforgeeks.org/problems/maximum-no-of-1s-row3027/1/#
 
 see All three Approaches.
 1.M*N (Linear Search)
 2.NlogM (Binary Search)
 3.This current Approach (M+N)
 
 */

class Sol
{
    public static int binarySearch(int a[],int m)
    {
        int low=0;
        int high=m-1;
        int index=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==1)
            {
                index=Math.min(mid,index);
                high=mid-1;
                
            }
            else
            {
                low=mid+1;
            }
        }
        return index;
    }
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int index=binarySearch(Mat[0],M);
        int row_no=0;
        for(int i=1;i<N;i++)
        {
            if(index-1>=0  && Mat[i][index-1]==1)
            {
                for(int j=index-1;j>=0;j--)
                {
                    if(Mat[i][j]==0)
                    {
                        break;
                    }
                    else
                    {
                        index=j;
                    }
                }
                row_no=i;
            }
        }
        return row_no;
        
    }
}
