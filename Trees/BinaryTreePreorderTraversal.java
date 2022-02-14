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
 
 https://leetcode.com/problems/binary-tree-preorder-traversal/

*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<TreeNode>st=new Stack<>();
        //st.push(root);
        while(st.size()!=0 || root!=null) 
        {
            while(root!=null)
            {
                ans.add(root.val);
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            root=root.right;
        }
        return ans;
        
        
    }
}
