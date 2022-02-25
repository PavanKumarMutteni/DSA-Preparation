/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/**

https://leetcode.com/problems/clone-graph/

*/

class Solution {
    public static void dfs(Node node,Node copy,Node visited[])
    {
        visited[node.val]=copy;
        
        for(Node n:node.neighbors)
        {
            if(visited[n.val]==null)
            {
                Node curr=new Node(n.val);
                visited[n.val]=curr;
                copy.neighbors.add(curr);
                dfs(n,curr,visited);
            }
            else
            {
                copy.neighbors.add(visited[n.val]);
            }
        }
        
    }
    public Node cloneGraph(Node node) {
        
        if(node==null)
            return null;
        Node copy=new Node(node.val);
        Node visited[]=new Node[101];
        Arrays.fill(visited,null);
        dfs(node,copy,visited);
        return copy;
    }
}
