/**

https://leetcode.com/problems/combination-sum/

**/
class Solution {
    
    public static void f(int i,int a[],int      target,List<List<Integer>>ans,List<Integer>temp)
    {
       
        if(i==a.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        if(a[i]<=target){
            temp.add(a[i]);
            f(i,a,target-a[i],ans,temp);
            temp.remove(temp.size()-1);
        }    
       f(i+1,a,target,ans,temp);
        
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
         f(0,candidates,target,ans,temp);
        return ans;
    }
}
