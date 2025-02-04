class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) {
        return head;
    }
    
    ListNode prev = null;
    ListNode current = head;
    
    while (current != null) {
        ListNode nextNode = current.next;
        current.next = prev; 
        prev = current;
        current = nextNode; 
    }
    
    return prev;
}
}
