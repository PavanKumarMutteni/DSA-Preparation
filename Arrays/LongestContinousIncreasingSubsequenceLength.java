/**

 https://leetcode.com/problems/longest-continuous-increasing-subsequence/

*/
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int curr=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                curr++;
            }
            else
            {
                ans=Math.max(ans,curr);
                curr=1;
            }
        }
        ans=Math.max(ans,curr);
        return ans;
    }
}
