/**

https://leetcode.com/problems/summary-ranges/

**/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String>ans=new ArrayList<>();
        int n=nums.length;
        if(n==0)
            return ans;
        for(int i=0;i<n;i++)
        {
            int start=nums[i];
            while(i+1<n && nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(start!=nums[i])
                ans.add(String.valueOf(start)+"->"+String.valueOf(nums[i]));
            else
                ans.add(String.valueOf(start));
        }
        return ans;
    }
}
