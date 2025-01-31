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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        if (n == length) {
            return head.next;
        }
        int index=length-n;
        temp=head;
        for (int i = 1; i < index; i++) {  // Fix: Stop at correct index
            temp = temp.next;
        }
         temp.next = temp.next.next;
        return head;
    }
}
