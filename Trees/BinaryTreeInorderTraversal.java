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
  
  https://leetcode.com/problems/binary-tree-inorder-traversal/
  

*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>ans=new ArrayList<>();
        if(root==null)
          return ans;
        Stack<TreeNode>st=new Stack<>();
        while(st.size()!=0 || root!=null)
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            ans.add(root.val);
            root=root.right;
        }
        
        return ans;
    }
}
