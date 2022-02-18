/**

https://leetcode.com/problems/remove-k-digits/

*/

class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k>=num.length()) return "0";
        char a[]=num.toCharArray();
        Stack<Character>s=new Stack<>();
        s.push(a[0]);
        for(int i=1;i<num.length();i++)
        {
            while(k>0 && s.size()!=0 && a[i]<s.peek())
            {
                k--;
                s.pop();
            }
            s.push(a[i]);
            
        }
        while(k>0 && s.size()!=0)
        {
            s.pop();
            k--;
        }
       StringBuilder sb=new StringBuilder();
        while(s.size()!=0)
        {
           sb.append(s.pop());
        }
       sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
      
        if(sb.length()>0) return sb.toString();
        return "0";
        
        
        
    }
}
