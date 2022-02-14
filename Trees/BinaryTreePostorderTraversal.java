/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 
 /**
 
    https://leetcode.com/problems/binary-tree-postorder-traversal/
 
 */
 */
class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;
       Stack<TreeNode>st=new Stack<>();
    
        while(st.size()!=0 || root!=null)
        {
            if(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            else
            {
                TreeNode temp=st.peek().right;
                if(temp==null)
                {
                    temp=st.pop();
                    ans.add(temp.val);
                    while(st.size()!=0 && temp==st.peek().right)
                    {
                        temp=st.pop();
                        ans.add(temp.val);
                    }
                }
                else
                {
                    root=temp;
                }
               
            }
        }
        return ans;
    }
}
