/**
 
 
 https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1/
 
 */
class Solution
{
    public static void Left(Node root,ArrayList<Integer>ans)
    {
        if(root==null) return ;
        if(root.left!=null){
           ans.add(root.data);
           Left(root.left,ans);
        }
        else if(root.right!=null){
           ans.add(root.data);
           Left(root.right,ans);
        }
    }
    public static void Right(Node root,ArrayList<Integer>ans)
    {
        if(root==null) return ;
        if(root.right!=null){
           Right(root.right,ans);
           ans.add(root.data);
        }
        else if(root.left!=null){
           
           Right(root.left,ans);
           ans.add(root.data);
        }
    }
    public static void Leaves(Node root,ArrayList<Integer>ans)
    {
        if(root==null)
         return;
        
        Leaves(root.left,ans);
        if(root.left==null && root.right==null)
          ans.add(root.data);
        Leaves(root.right,ans);
        
    }
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer>ans=new ArrayList<>();
	    if(root==null)
	     return ans;
	    ans.add(root.data);
	    Left(root.left,ans);
	    Leaves(root.left,ans);
	    Leaves(root.right,ans);
	    Right(root.right,ans);
	    return ans;
	}
}
