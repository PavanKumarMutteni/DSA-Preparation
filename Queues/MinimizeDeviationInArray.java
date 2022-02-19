/**

 https://leetcode.com/problems/minimize-deviation-in-array/

*/
class Solution {
    public int minimumDeviation(int[] nums) {
        
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
        int n=nums.length;
        int ans=0;
      for(int i=0;i<n;i++)
      {
          if(nums[i]%2!=0)
              nums[i]=nums[i]*2;
          min=Math.min(min,nums[i]);
          max=Math.max(max,nums[i]);
      }
    ans=max-min;
    PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
            p.add(i);
        while(p.peek()%2==0)
        {
             int top = p.poll();
            
            ans = Math.min(ans, top - min);
            top /= 2;
            min = Math.min(min, top);  // updating min
            p.add(top);   // pus
          
           
        }
        
        return Math.min(ans,p.peek()-min);
        
      
        
    }
}


       
