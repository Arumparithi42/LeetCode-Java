/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);
                ListNode start = head;
                ListNode ahead = head;
                for(int i = 0; i < length; i++)
                    ahead = ahead.next;
                while(ahead != start){
                    ahead = ahead.next;
                    start = start.next;
                }
                return start;
            }
        }
        return null;
    }
}