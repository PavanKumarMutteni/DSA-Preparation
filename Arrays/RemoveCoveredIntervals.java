
/**

  https://leetcode.com/problems/remove-covered-intervals/

**/
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
       
         Arrays.sort(intervals,(a,b)-> (a[0]==b[0]? b[1]-a[1]: a[0]-b[0]));
       
        int ans=0;
        int max_right=-1;
        for(int i=0;i<intervals.length;i++)
        {
            if( intervals[i][1]>max_right)
            {
                ans++;
            }
            max_right=Math.max(max_right,intervals[i][1]);
        }
        return ans;
    }
}
