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
 */
/**
 
    https://leetcode.com/problems/binary-tree-postorder-traversal/
 
 */
class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<TreeNode>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st1.push(root);
        while(st1.size()!=0)
        {
            root=st1.pop();
            st2.push(root.val);
            if(root.left!=null)
            {
                st1.push(root.left);
            }
            if(root.right!=null)
            {
                st1.push(root.right);
            }
        }
        while(st2.size()!=0)
        {
            ans.add(st2.pop());
        }
        return ans;
        
    }
}
