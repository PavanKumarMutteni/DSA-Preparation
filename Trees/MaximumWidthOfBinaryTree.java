/**

    https://leetcode.com/problems/maximum-width-of-binary-tree/

**/
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

class Pair
{
    TreeNode head;
    int pos;
    Pair(TreeNode head,int pos)
    {
        this.head=head;
        this.pos=pos;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
       Queue<Pair> q=new LinkedList<Pair>();
       q.add(new Pair(root,0));
       int ans=1;
       while(q.size()!=0)
       {
            Pair p=q.peek();
            TreeNode head=p.head;
            TreeNode tail=head;
           Pair p1=p;
           int size=q.size();
           while(size-->0)
           {
               p1=q.poll();
               tail=p1.head;
               if(tail.left!=null)
                   q.add(new Pair(tail.left,p1.pos*2));
               if(tail.right!=null)
                    q.add(new Pair(tail.right,p1.pos*2+1));
                   
                   
           }
           ans=Math.max(ans,p1.pos-p.pos+1);
           
       }
        return ans;
           
        
    }
}
