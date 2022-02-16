/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/***

 https://leetcode.com/problems/swap-nodes-in-pairs/

*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode ans=head;
        while(head!=null && head.next!=null)
        {
            int temp=head.val;
            head.val=head.next.val;
            head.next.val=temp;
            head=head.next.next;
        }
        return ans;
    }
}
