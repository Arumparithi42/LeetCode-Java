/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tailA = headA;
        ListNode tailB = headB;
        while(tailA != tailB){
            if (tailA == null)
                tailA = headB;
            else
                tailA = tailA.next;
            if (tailB == null)
                tailB = headA;
            else
                tailB = tailB.next;
            
        }
        return tailA;
    }
}