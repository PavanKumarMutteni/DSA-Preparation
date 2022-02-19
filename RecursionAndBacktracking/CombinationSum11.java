/**

    https://leetcode.com/problems/combination-sum-ii/

**/

class Solution {
    public static void f(int i,int []a,List<List<Integer>>ans,List<Integer>temp,int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int idx=i;idx<a.length;idx++)
        {
            if(idx>i && a[idx]==a[idx-1]) continue;
            if(a[idx]>target)
                break;
            temp.add(a[idx]);
            f(idx+1,a,ans,temp,target-a[idx]);
            temp.remove(temp.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        f(0,candidates,ans,temp,target);
        return ans;
        
    }
}
