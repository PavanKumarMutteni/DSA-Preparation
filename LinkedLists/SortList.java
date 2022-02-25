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
/**
 
 
 https://leetcode.com/problems/sort-list/


**/
class Solution {
    
    public static ListNode midNode(ListNode head)
    {
        if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode low,ListNode mid)
    {
        ListNode ans=new ListNode(-1);
        ListNode curr=ans;
        while(low!=null && mid!=null)
        {
            if(low.val<mid.val)
            {
                curr.next=low;
                low=low.next;
            }
            else
            {
                curr.next=mid;
                mid=mid.next;
            }
            curr=curr.next;
        }
        if(low!=null)
        {
            curr.next=low;
        }
        if(mid!=null)
        {
            curr.next=mid;
        }
        return ans.next;
    }
    public static ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode midElement=midNode(head);
        ListNode mid=midElement.next;
        midElement.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(mid);
         return merge(left,right);
    }
    public ListNode sortList(ListNode head) {
        
        if(head==null)
           return null;        
         return mergeSort(head);
        
        
        
    }
}
